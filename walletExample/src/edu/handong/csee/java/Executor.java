package edu.handong.csee.java;

import edu.handong.csee.java.finance.Wallet;
import edu.handong.csee.java.finance.WalletManager;
//import edu.handong.csee.java.finance.*;
// *로 전부 불러와도 되지만 메모리를 생각해서 따로 하는 걸  추천.

public class Executor {//이것도 하나의 객체임.

	public static void main(String[] args) {

		Executor myExecutor = new Executor();

		myExecutor.run(args);

	}

	public void run(String[] args) {
		WalletManager jc = new WalletManager();
		jc.setName("JC Nam");
		WalletManager jh = new WalletManager();
		jh.setName("JH Park");

		Wallet jcWallet = new Wallet();
		Wallet jhWallet = new Wallet();
		
		jcWallet.insert(Integer.parseInt(args[0]));
		jhWallet.insert(Integer.parseInt(args[1]));
		
		jc.setWallet(jcWallet);
		jh.setWallet(jhWallet);

		jcWallet.takeOut(1000);
		jhWallet.takeOut(2000);

		jc.checkMyAmount();
		jh.checkMyAmount();
	}

}