package handson7_strings;

import java.util.Scanner;

public class Log_sanitize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user : ");
		String user = sc.nextLine();

		System.out.println("Enter password : ");
		String password = sc.next();

		System.out.println("Enter IP : ");
		String ip = sc.next();

		System.out.println("Enter status :");
		String status = sc.next();

		for (int i = 0; i < password.length(); i++) {
			password = password.replace(password.charAt(i), '*');
		}

		String[] ip_arr = ip.split("\\.");

		for (int i = 0; i < ip_arr.length; i++) {
			ip_arr[i] = "xxx";
		}

		ip = String.join(".", ip_arr);

		System.out.println("User : " + user);
		System.out.println("Password :" + password);
		System.out.println("IP : " + ip);
		System.out.println("Status : " + status);
		sc.close();

	}

}
