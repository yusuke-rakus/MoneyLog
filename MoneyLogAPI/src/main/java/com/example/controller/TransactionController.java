package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.Status;
import com.example.common.exception.AuthenticationException;
import com.example.common.exception.SystemException;
import com.example.form.AddTransactionForm;
import com.example.form.DeleteTransactionForm;
import com.example.form.EditTransactionForm;
import com.example.form.GetHomeForm;
import com.example.form.GetMonthlyFixedIncomeForm;
import com.example.form.GetMonthlyFixedSpendingForm;
import com.example.form.GetMonthlySpendingDataForm;
import com.example.form.GetMonthlyVariableDataForm;
import com.example.form.GetTimelineDataForm;
import com.example.form.GetTransactionForm;
import com.example.response.AddTransactionResponse;
import com.example.response.DeleteTransactionResponse;
import com.example.response.EditTransactionResponse;
import com.example.response.GetHomeResponse;
import com.example.response.GetMonthlyFixedIncomeResponse;
import com.example.response.GetMonthlyFixedSpendingResponse;
import com.example.response.GetMonthlySpendingDataResponse;
import com.example.response.GetMonthlyVariableDataResponse;
import com.example.response.GetTimelineDataResponse;
import com.example.response.GetTransactionResponse;
import com.example.service.AuthenticationService;
import com.example.service.TransactionService;
import com.example.service.ValidationService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private ValidationService validationService;

	/**
	 * ???????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/addTransaction")
	public AddTransactionResponse addTransaction(@RequestBody @Validated AddTransactionForm form, BindingResult result)
			throws SystemException {
		AddTransactionResponse res = new AddTransactionResponse();

		if (result.hasErrors()) {
			String errorMessage = validationService.getFirstErrorMessage(result);
			res.setStatus(Status.ERROR.getStatus());
			res.setMessage(errorMessage);
			return res;
		}

		return transactionService.addTransaction(form, res);
	}

	/**
	 * ???????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/deleteTransaction")
	public DeleteTransactionResponse deleteTransaction(@RequestBody DeleteTransactionForm form) throws SystemException {
		return transactionService.deleteTransaction(form);
	}

	/**
	 * ???????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/editTransaction")
	public EditTransactionResponse editTransaction(@RequestBody @Validated EditTransactionForm form,
			BindingResult result) throws SystemException {
		EditTransactionResponse res = new EditTransactionResponse();

		if (result.hasErrors()) {
			String errorMessage = validationService.getFirstErrorMessage(result);
			res.setStatus(Status.ERROR.getStatus());
			res.setMessage(errorMessage);
			return res;
		}

		return transactionService.editTransaction(form, res);
	}

	/**
	 * ?????????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getTransaction")
	public GetTransactionResponse getTransaction(@RequestBody GetTransactionForm form) throws SystemException {
		return transactionService.getTransaction(form);
	}

	/**
	 * ????????????????????????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getMonthlySpendingData")
	public GetMonthlySpendingDataResponse getMonthlySpendingData(@RequestBody GetMonthlySpendingDataForm form)
			throws SystemException {
		return transactionService.getMonthlySpendingData(form);
	}

	/**
	 * ???????????????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getMonthlyFixedSpending")
	public GetMonthlyFixedSpendingResponse getMonthlyFixedSpending(@RequestBody GetMonthlyFixedSpendingForm form)
			throws SystemException {
		return transactionService.getMonthlyFixedSpending(form);
	}

	/**
	 * ???????????????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getMonthlyFixedIncome")
	public GetMonthlyFixedIncomeResponse getMonthlyFixedIncome(@RequestBody GetMonthlyFixedIncomeForm form)
			throws SystemException {
		return transactionService.getMonthlyFixedIncome(form);
	}

	/**
	 * ?????????Transaction??????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getTimelineData")
	public GetTimelineDataResponse getMonthlyFixedIncome(@RequestBody GetTimelineDataForm form) throws SystemException {
		return transactionService.getTimelineData(form);
	}

	/**
	 * ??????????????????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getHome")
	public GetHomeResponse getHome(@RequestBody GetHomeForm form) throws SystemException {
		return transactionService.getHome(form);
	}

	/**
	 * ???????????????????????????????????????????????????
	 * 
	 * @throws AuthenticationException
	 */
	@PostMapping("/getMonthlyVariableData")
	public GetMonthlyVariableDataResponse getMonthlyVariableData(@RequestBody GetMonthlyVariableDataForm form)
			throws SystemException {
		GetMonthlyVariableDataResponse res = new GetMonthlyVariableDataResponse();

		// ??????????????????
		Long userNo = authenticationService.authUser(form);
		form.setUserNo(userNo);

		return transactionService.getMonthlyVariableData(form, res);
	}
}
