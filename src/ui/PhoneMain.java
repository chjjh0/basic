package ui;

import javax.swing.JOptionPane;

import domain.CellPhone;
import domain.GalaxyPhone;
import domain.IPhone;
import domain.Phone;
enum Phone_Butt {
	EXIT,
	TELEPHONE,
	SMARTPHONE,
	IPHONE,
	GALAXY,
}	
public class PhoneMain {
   public static void main(String[] args) {
	   Phone_Butt[] buttons = {
			   Phone_Butt.EXIT,
			   Phone_Butt.TELEPHONE,
			   Phone_Butt.SMARTPHONE,
			   Phone_Butt.IPHONE,
			   Phone_Butt.GALAXY,
		};
	  Phone phone;
	  CellPhone cellphone;
	  IPhone iphone;
	  GalaxyPhone galaxy;
	  Phone arr[] = new Phone[3];
      while(true) {
         switch((Phone_Butt)JOptionPane.showInputDialog(
					null,	//frame
					"MATRIX PAGE", //frame title
					"SELECT MATRIX MENU", //ORDER
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, //array of choices
					null //default
					)) {
         case EXIT : return;
         case TELEPHONE : 
        	 phone = new Phone();
        	 phone.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
        	 phone.setPhoneNum(JOptionPane.showInputDialog("전화번호를 입력하세요"));
        	 phone.setCall(JOptionPane.showInputDialog("통화내용을 입력하세요"));
        	 JOptionPane.showMessageDialog(null, phone.toString());
        	 break;
         case SMARTPHONE :
        	 cellphone = new CellPhone();
        	 cellphone.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
        	 cellphone.setPhoneNum(JOptionPane.showInputDialog("전화번호를 입력하세요"));
        	 cellphone.setCall(JOptionPane.showInputDialog("통화내용을 입력하세요"));
        	 JOptionPane.showMessageDialog(null, cellphone.toString());
        	 break;
         case IPHONE :
        	 iphone = new IPhone();
        	 iphone.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
        	 iphone.setPhoneNum(JOptionPane.showInputDialog("전화번호를 입력하세요"));
        	 iphone.setCall(JOptionPane.showInputDialog("통화내용을 입력하세요"));
        	 JOptionPane.showMessageDialog(null, iphone.toString());
        	 break;
         case GALAXY :
        	 galaxy = new GalaxyPhone();
        	 galaxy.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
        	 galaxy.setPhoneNum(JOptionPane.showInputDialog("전화번호를 입력하세요"));
        	 galaxy.setCall(JOptionPane.showInputDialog("통화내용을 입력하세요"));
        	 JOptionPane.showMessageDialog(null, galaxy.toString());
        	 break;
         default: 
            break;
         }
      }

   }
}