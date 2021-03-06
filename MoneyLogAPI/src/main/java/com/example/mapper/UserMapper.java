package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;
import com.example.form.ChangeEmailForm;
import com.example.form.ChangePasswordForm;
import com.example.form.EditThemeColorForm;
import com.example.form.GetUserInfoForm;
import com.example.form.LoginForm;
import com.example.form.RegistUserForm;

@Mapper
public interface UserMapper {

	/** ユーザーIDからユーザーNoを取得 */
	public Long getUserNoFromUserId(String UserId);

	/** ユーザー登録 */
	public void registUser(RegistUserForm form);

	/** ログイン */
	public User login(LoginForm form);

	/** ユーザー情報の取得 */
	public User getUserInfo(GetUserInfoForm form);
	
	/** パスワード変更 */
	public boolean changePassword(ChangePasswordForm form);
	
	/** メールアドレスを変更 */
	public boolean changeEmail(ChangeEmailForm form);
	
	/** テーマカラーの変更 */
	public boolean editThemeColor(EditThemeColorForm form);

}
