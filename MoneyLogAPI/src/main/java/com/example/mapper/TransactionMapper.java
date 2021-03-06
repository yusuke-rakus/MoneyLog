package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.CategoryList;
import com.example.domain.MonthlyFixedList;
import com.example.domain.Transaction;
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

@Mapper
public interface TransactionMapper {

	/** 収支を登録 */
	public void addTransaction(AddTransactionForm form);

	/** 収支を削除 */
	public void deleteTransaction(DeleteTransactionForm form);

	/** 収支を編集 */
	public void editTransaction(EditTransactionForm form);

	/** 収支詳細の取得 */
	public Transaction getTransaction(GetTransactionForm from);

	/** ６ヶ月分の合計支出を取得 */
	public List<Transaction> getMonthlySpendingData(GetMonthlySpendingDataForm form);

	/** 月別固定支出の取得 */
	public List<MonthlyFixedList> getMonthlyFixedSpending(GetMonthlyFixedSpendingForm form);

	/** 月別固定収入の取得 */
	public List<MonthlyFixedList> getMonthlyFixedIncome(GetMonthlyFixedIncomeForm form);

	/** 当月のTransactionデータを取得 */
	public List<Transaction> getTimelineData(GetTimelineDataForm form);

	/** ホーム画面情報を取得 */
	public List<CategoryList> getHome(GetHomeForm form);

	/** 指定月の変動費・変動費合計を取得 */
	public List<CategoryList> getMonthlyVariableData(GetMonthlyVariableDataForm form);

}
