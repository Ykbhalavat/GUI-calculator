// created by : yash bhalavat 
// this is a gui calculator which gives you different output 

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


	public class Cal_program extends JFrame 
	{
  // jlabels,jbuttons and textfields
		private JLabel button_label;
		private JButton button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8;
		private JButton button_9, button_Mult, button_Div, button_Eql, button_Sub, button_Add, button_C, button_stop;
		private JButton button_and, button_A, button_B,button_cc,button_D, button_E,button_F;
		private JButton button_Xor, button_Not, button_Or,button_Lsh;
		private JButton button_Rsh,button_Mod, button_plusmin,button_Bin, button_lookup;
		private JButton button_CE, button_retunx, button_braceopen;
		private JButton button_braceclose, button_Dec, button_Hex,button_Oct, buttonBack; 
		private double TEMP;
		private double SolveTemp;
		private JTextField Result, ResultBin,ResultHex, ResultOct, ResultDec;

		 public Cal_program() // Constructor for the class
		 {

				JPanel first_panel = new JPanel();
				first_panel.setLayout(new GridLayout(7,5));

				first_panel.add(button_Lsh =  new JButton("Lsh")); first_panel.add(button_Rsh =  new JButton("Rsh")); 
				first_panel.add(button_Or =  new JButton("Or"));first_panel.add(button_Xor =  new JButton("Xor"));
				first_panel.add(button_Not =  new JButton("Not")); first_panel.add(button_and = new JButton("AND")); 
				first_panel.add(button_lookup = new JButton("↑"));
			
				JPanel second_panel = new JPanel();
				second_panel.setLayout(new GridLayout(7,5));
				second_panel.add(button_label = new JLabel(" \u2630" + " Programmer ")); 
				second_panel.add(Result = new JTextField(20)); 
				second_panel.add(ResultBin = new JTextField(20));
				second_panel.add(ResultHex = new JTextField(20)); 
				second_panel.add(ResultOct = new JTextField(20));   

				Result.setHorizontalAlignment(JTextField.LEFT);
				ResultBin.setHorizontalAlignment(JTextField.LEFT);
				ResultHex.setHorizontalAlignment(JTextField.LEFT);
				ResultOct.setHorizontalAlignment(JTextField.LEFT);
				
				Result.setEditable(false);
				ResultBin.setEditable(false);
				ResultHex.setEditable(false);
				ResultOct.setEditable(false);
				
				JPanel p3 = new JPanel();
				p3.setLayout(new FlowLayout());
				p3.add(button_Bin = new JButton("Bin"));
				p3.add(button_Hex = new JButton("Hex"));
				p3.add(button_Oct = new JButton("Oct")); 
				p3.add(button_Dec = new JButton("Dec"));

			
		first_panel.add(button_Mod = new JButton("Mod")); 	first_panel.add(button_CE = new JButton("CE")); first_panel.add(button_C = new JButton("C"));
		first_panel.add(button_retunx = new JButton("<-"));	first_panel.add(button_Div = new JButton("÷")); first_panel.add(button_A = new JButton("A"));
		first_panel.add(button_B = new JButton("B")); first_panel.add(button_7 = new JButton("7"));	first_panel.add(button_8 = new JButton("8"));
		first_panel.add(button_9 = new JButton("9")); first_panel.add(button_Mult = new JButton("X")); 
		first_panel.add(button_cc = new JButton("C")); first_panel.add(button_D = new JButton("D")); first_panel.add(button_4 = new JButton("4")); 
		first_panel.add(button_5 = new JButton("5"));
		first_panel.add(button_6 = new JButton("6")); first_panel.add(button_Sub = new JButton("-"));	
		first_panel.add(button_E = new JButton("E"));
		first_panel.add(button_F = new JButton("F")); first_panel.add(button_1 = new JButton("1"));	first_panel.add(button_2 = new JButton("2"));
		first_panel.add(button_3 = new JButton("3")); first_panel.add(button_Add = new JButton("+")); first_panel.add(button_braceopen = new JButton("("));
		first_panel.add(button_braceclose = new JButton(")")); first_panel.add(button_plusmin = new JButton("+/-")); 
		first_panel.add(button_0 = new JButton("0"));
		first_panel.add(button_stop =  new JButton(".")); first_panel.add(button_Eql = new JButton("=")); 
			 
				JPanel final_panel = new JPanel();
				final_panel.add(second_panel);
				final_panel.add(p3);
				final_panel.setLayout(new BoxLayout(final_panel, BoxLayout.Y_AXIS));
				final_panel.add(first_panel);
				add(final_panel);
				

			button_1.addActionListener(new ListentoOne());
			button_2.addActionListener(new ListentoTwo());
			button_3.addActionListener(new ListentoThree());
			button_4.addActionListener(new ListentoFour());
			button_5.addActionListener(new ListentoFive());
			button_6.addActionListener(new ListentoSix());
			button_7.addActionListener(new ListentoSeven());
			button_8.addActionListener(new ListentoEight());
			button_9.addActionListener(new ListentoNine());
			button_0.addActionListener(new ListentoZero());
			button_Add.addActionListener(new ListentoAdd());
			button_Sub.addActionListener(new ListentoSubtract());
			button_Mult.addActionListener(new ListentoMultiply());
			button_Div.addActionListener(new ListentoDivide());
			button_C.addActionListener(new ListenClear());
			button_Eql.addActionListener(new ListentoSolve());
			button_stop.addActionListener(new ListentoDot());
			button_A.addActionListener(new ListentoA());
			button_B.addActionListener(new ListentoB());
			button_cc.addActionListener(new ListentoC());
			button_D.addActionListener(new ListentoD());
			button_E.addActionListener(new ListentoE());
			button_F.addActionListener(new ListentoF());
			button_Mod.addActionListener(new ListentoMOD()); 
			button_plusmin.addActionListener(new ListentoSignChange()); 
			button_Bin.addActionListener(new ListentoBin()); 
			button_Dec.addActionListener(new ListentoDec());
			button_Hex.addActionListener(new ListentoHex());
			button_Oct.addActionListener(new ListentoOct());

	        try
	       
	        {
	          UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	           
	        }
	     catch(Exception e)
	           {   }
	        
	        SwingUtilities.updateComponentTreeUI(final_panel);   
		 }
		 
		// setting the functions false to make sure the check of operators 
		Boolean addBool = false; 
		Boolean subBool = false; 
		Boolean divBool = false;
		Boolean mulBool = false;
		Boolean modBool = false; 
		Boolean final_Eql    = false; 
		Boolean bin = false;
		Boolean add = false; 
		Boolean dec = true;
		Boolean hex = false;
		Boolean oct = false; 
		// making a string to print the display
		String display = "";
		String displayBin = ""; 
		String displayHex = ""; 
		String displayOct = ""; 
		String binTemp = ""; 
		String binSolveTemp =""; 
		String tempHex = ""; 
		String SolveTemphex = ""; 
		String octSolveTemp = "";
		String octTemp = ""; 
	
		// convert a string to binary 
		public static String binaryConverter(int dec)
		{
			String str2 = "";
			int finalvalue; 
			if (dec == 0) {
			return "";
			}
			
			else
			{
			  finalvalue = (dec%2); 
				str2 = str2 + finalvalue;
				return binaryConverter(dec/2) + finalvalue; 
		
		    }
		}
		
		// convert a decinmal to hexa-decimal 
		public static String dec2Hex(int value)
		{
			String result = "";
			int remain = value %16;
			
			if(value == 0)
			{
				return "0";  
			}
			
			else 
			{
				switch (remain)
				{
				case 10: 
					result = "A";
					break;
				case 11:
					result = "B";
					break; 
				case 12: 
					result = "C";
					break; 
				case 13:
					result = "D";
					break;
				case 14:
					result = "E";
					break;
				case 15:
					result = "F";
					break;
				default:
					result = remain + result; 
				}
				return dec2Hex(value/16)+  result; 
				
			}
			
		}
			// getting an octol value for the decimals 
		public static String toOctal(int decimal){    
			    int value; 
			    String octal=" "; 
			    char octalchars[]={'0','1','2','3','4','5','6','7'};  
			    //writing logic of decimal to octal conversion   
			    while(decimal>0)  
			    {  
			    	value=decimal%8;   
			       octal=octalchars[value]+octal;   
			       decimal=decimal/8;  
			    }  
			    return (" " + octal);  
			} 
		 // convert octal to decimal 
			public static int oct2Dec(String octal)
		    {
				int a = Integer.parseInt(octal);	
		        int decimalNumber = 0, i = 0;

		        while(a != 0)
		        {
		            decimalNumber += (a % 10) * Math.pow(8, i);
		            ++i;
		            a/=10;
		        }

		        return decimalNumber;
		    }
			// convert binary to decimal
			public static int bin2Dec(String binInput)
			{  
			    int len = binInput.length();
			    if (len == 0) 
			    return 0;
			    else {
			    String now = binInput.substring(0,1);
			    String later = binInput.substring(1);
			    return Integer.parseInt(now) * (int)Math.pow(2, len-1) + bin2Dec(later);   
			    }
			  }
			// get twos complimant to convert negtive 
			 static String findTwoscomplement(StringBuffer str) 
			    { 
			        int n = str.length(); 
			       
			        // Traverse the string to get first '1' from 
			        // the last of string 
			        int i; 
			        for (i = n-1 ; i >= 0 ; i--) 
			            if (str.charAt(i) == '1') 
			                break; 
			       
			        // If there exists no '1' concat 1 at the 
			        // starting of string 
			        if (i == -1) 
			            return "1" + str; 
			       
			        // Continue traversal after the position of 
			        // first '1' 
			        for (int k = i-1 ; k >= 0; k--) 
			        { 
			            //Just flip the values 
			            if (str.charAt(k) == '1') 
			                str.replace(k, k+1, "0"); 
			            else
			                str.replace(k, k+1, "1"); 
			        } 
			       
			        // return the modified string 
			        return str.toString(); 
			    } 

			  // binary conversion
			 public static String addBinary(String a, String b)
			 {
				    // Use as radix 2 because it's binary    
				    int number0 = Integer.parseInt(a, 2);
				    int number1 = Integer.parseInt(b, 2);
				    int sum = number0 + number1;
				    return Integer.toBinaryString(sum); //returns the answer as a binary value;
				}
			

			public static String subBinary(String bin1, String bin2)
			{
				
				int a = bin2Dec(bin1);
				int b = bin2Dec(bin2);
				int result = a - b;
				String total = binaryConverter(result);
				
				return total; 
				
			}
			
			String binMul(String bin1, String bin2)
			{
				int a = bin2Dec(bin1);
				int b = bin2Dec(bin2);
				int result = a * b; 
				String total = binaryConverter(result);
				return total; 
			}

			String binDiv(String bin1, String bin2)
			{
				int a = bin2Dec(bin1);
				int b = bin2Dec(bin2);
				int result = a/b; 
				String total = binaryConverter(result);
				return total; 		
			}
			
			String binMod(String bin1, String bin2)
			{
				int a = bin2Dec(bin1);
				int b = bin2Dec(bin2);
				int result = a%b; 
				String total = binaryConverter(result);
				return total; 
				
			}
			
			private static int hex2Dec(String hexNum) {
				int decimal = 0;
				String Code = "0123456789ABCDEF"; 
				hexNum = hexNum.toUpperCase(); // Used if the user inputs hex values that have lower case
				int length = hexNum.length();
				if (length > 0) {
					char ch = hexNum.charAt(0); 
					int digit = Code.indexOf(ch);
					String substring = hexNum.substring(1);
					decimal = digit * (int) Math.pow(16, length - 1) + hex2Dec(substring);
				}
				return decimal;
			}
			
			String hexAdd(String hex1, String hex2)
			{
				int a = hex2Dec(hex1);
				int b = hex2Dec(hex2);
				int	result = a + b;
				String total = dec2Hex(result); 
				return total; 
				
			}
			
			String hexMod(String hex1, String hex2)
			{
				int a = hex2Dec(hex1);
				int b = hex2Dec(hex2);
				int	result = a % b;
				String total = dec2Hex(result); 
				return total; 
				
			}
			
			String hexSub(String hex1, String hex2)
			{
				int a = hex2Dec(hex1);
				int b = hex2Dec(hex2);
				int	result = a - b;
				String total = dec2Hex(result); 
				return total; 
				
			}
			
			String hexMul(String hex1, String hex2)
			{
				int a = hex2Dec(hex1);
				int b = hex2Dec(hex2);
				int	result = a * b;
				String total = dec2Hex(result); 
				return total; 
				
			}
			
			
			String hexDiv(String hex1, String hex2)
			{
				int a = hex2Dec(hex1);
				int b = hex2Dec(hex2);
				int	result = a/b;
				String total = dec2Hex(result); 
				return total; 
				
			}
			
			
			String octAdd(String oct1, String oct2)
			{
				int a = oct2Dec(oct1);
				int b = oct2Dec(oct2);
				int result = a + b;
				String total = Integer.toString(result);
				return total; 
			}
			
			String octSub(String oct1, String oct2)
			{
				int a = oct2Dec(oct1);
				int b = oct2Dec(oct2);
				int result = a - b;
				String total = Integer.toString(result);
				return total; 
			}
			
			
			String octMul(String oct1, String oct2)
			{
				int a = oct2Dec(oct1);
				int b = oct2Dec(oct2);
				int result = a * b;
				String total = Integer.toString(result);
				return total; 
			}
			
			String octDiv(String oct1, String oct2)
			{
				int a = oct2Dec(oct1);
				int b = oct2Dec(oct2);
				int result = a / b;
				String total = Integer.toString(result);
				return total; 
			}
			
			String octMod(String oct1, String oct2)
			{
				int a = oct2Dec(oct1);
				int b = oct2Dec(oct2);
				int result = a % b;
				String total = Integer.toString(result);
				return total; 
			}
			
		 
		 
		 class ListentoA implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "A");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec " + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
				}
				
			}
			 
		 }
		 
		 class ListentoB implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "B");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
				}
				
			}
			 
		 }
		  
		 
		 class ListentoC implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "C");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
				}
				
			}
			 
		 }
		 
		 
		 
		 class ListentoD implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "D");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
				}
				
			}
			 
		 }
		 // this program checks for the function
		 class ListentoE implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "E");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
				}
				
			}
			 
		 }
// this program for f value 
		 class ListentoF implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "F");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
				}
				
			}
			 
		 }
		 
		 // this is for octal 
		 class ListentoOct implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (oct == false)
				{
					bin = false;
					dec = false;
					hex = false;
					oct = true;
					
				}
				else {
					oct = false;
					dec = true;
				}
				
			}
			 
		 }
		 
		 //this is for decimals 
		 class ListentoDec implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dec == false)
				{
					bin = false;
					dec = true;
					hex = false;
					oct = false;
					
				}
				else {
					dec = false;
				}
				
			}
			 
		 }
		 // this is for hexadecimals 
		 class ListentoHex implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (hex == false)
				{
					bin = false;
					dec = false;
					hex = true;
					oct = false;
					
				}
				else {
					hex = false;
					dec = true;
				}
				
			}
			 
		 }
// this is for binary  
		 class ListentoBin implements ActionListener
		 {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (bin == false)
				{
					bin = true;
					dec = false;
					hex = false;
					oct = false;
					
				}
				else {
					bin = false;
					dec = true;
				}
				
			}
			 
		 }
		 // this is to clear the screens 
		 class ListenClear implements ActionListener
		 {

		 	@Override
		 	public void actionPerformed(ActionEvent e) {
		 		display = Result.getText();
		 		Result.setText("");
		 		ResultBin.setText("");
		 		ResultHex.setText("");
		 		ResultOct.setText("");
		 		addBool = false;
		 		subBool = false;
		 		divBool = false;
		 		mulBool = false; 
		 		modBool = false;
		 		TEMP = 0; 
		 		SolveTemp = 0; 
		 	}
		 }
		// this is for number 1 
		class ListentoOne  implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true) {
				display = Result.getText();
				Result.setText(display + "1");
			    int binDisp = Integer.parseInt(Result.getText()); 
			    String bin = binaryConverter(binDisp); 
			    ResultBin.setText("Bin: " + bin);
			    
			    int hexDisp = Integer.parseInt(Result.getText()); 
			    String hex = dec2Hex(hexDisp); 
			    ResultHex.setText("Hex: 0x" + hex);
			     
			    
			    int octDisp = Integer.parseInt(Result.getText()); 
			    String Oct = toOctal(octDisp); 
			    ResultOct.setText("Oct: " + Oct);
				}
			
				else if(bin == true)
				{
					displayBin = ResultBin.getText();
					ResultBin.setText(displayBin + "1");
					String decDispl = ResultBin.getText(); 
					String dec = Integer.toString(bin2Dec(decDispl)); 
					Result.setText("Dec: " + dec);
					
				    int hexDisp = Integer.parseInt(dec); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				     
				    
				    int octDisp = Integer.parseInt(dec); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
					
				}
				
				else if(hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "1");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				else if(oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "1");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);			
				}
			    
				final_Eql = false;		
		}
		}
		
		
		class ListentoTwo implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "2");
				
				//Binary Output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				  //Hex Output  
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "2");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
			
				}
		else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "2");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
		
				}
				final_Eql = false; 			    
			}
		}
		
		class ListentoThree implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "3");
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				//Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "3");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "3");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
				    
			}
		}
		class ListentoFour implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "4");
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "4");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "4");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
			}
		}
		class ListentoFive implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "5");
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "5");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "5");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
			}
		}
		
		class ListentoSix implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "6");
				
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "6");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "6");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
			}
		}
		
		class ListentoSeven implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "7");
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "7");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "7");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false;  
				    
			}
		}
		
		class ListentoEight implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "8");
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "8");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "8");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
			}
		}
		
		
		class ListentoNine implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				//Binary output
				Result.setText(display + "9");
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "9");
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec" + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "9");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
			}
		}
		
		class ListentoZero implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				if (dec == true)
				{
				display = Result.getText();
				Result.setText(display + "0");
				
				//Binary output
				   int binDisp = Integer.parseInt(Result.getText()); 
				    String bin = binaryConverter(binDisp); 
				    ResultBin.setText("Bin: " + bin);
				    //Hex output
				    int hexDisp = Integer.parseInt(Result.getText()); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				    
				    int octDisp = Integer.parseInt(Result.getText()); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
				}
				
				else if (bin == true)
				{
					displayBin = ResultBin.getText();
					ResultBin.setText(displayBin + "0");
					String decDispl = ResultBin.getText(); 
					String dec = Integer.toString(bin2Dec(decDispl)); 
					Result.setText("Dec: " + dec);
					
				    int hexDisp = Integer.parseInt(dec); 
				    String hex = dec2Hex(hexDisp); 
				    ResultHex.setText("Hex: 0x" + hex);
				     
				    
				    int octDisp = Integer.parseInt(dec); 
				    String Oct = toOctal(octDisp); 
				    ResultOct.setText("Oct: " + Oct);
					
				}
				else if (hex == true)
				{
					displayHex = ResultHex.getText();
					ResultHex.setText(displayHex + "1");
					
					String decDispl = ResultHex.getText();
					String dec = Integer.toString(hex2Dec(decDispl)); 
					Result.setText("Dec: " + dec);
					
					int bin = Integer.parseInt(dec);
					String binary = binaryConverter(bin); 
					ResultBin.setText("Bin: " + binary);
					
					int octDisp = Integer.parseInt(dec);
					String Oct = toOctal(octDisp);
					ResultOct.setText("Oct: " + Oct); 
					
					
				}
				
				else if (oct == true)
				{
					displayOct = ResultOct.getText();
					ResultOct.setText(displayOct + "0");
					
					String decDispl = ResultOct.getText();
					int dec = oct2Dec(decDispl);
					String dec2 = (Integer.toString(dec));
					Result.setText("Dec: " + dec2);
					String binary = binaryConverter(dec); 
					ResultBin.setText("Bin: " + binary);
					
					String hex = dec2Hex(dec); 
					 ResultHex.setText("Hex: 0x" + hex);
					
					
				}
				final_Eql = false; 
				    
			}
		}
		
		class ListentoDot implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (final_Eql == true)
				{
					Result.setText("");
			 		ResultBin.setText("");
			 		ResultHex.setText("");
				}
				display=Result.getText();
				Result.setText(display + ".");
				
			    int octDisp = Integer.parseInt(Result.getText()); 
			    String Oct = toOctal(octDisp); 
			    ResultOct.setText("Oct: " + Oct);
			    final_Eql = false; 
				
				
			}
			
		}
		
		class ListentoAdd implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dec == true)
				{
				TEMP = Double.parseDouble(Result.getText()); // Used to convert what is in result to a double
				Result.setText("");// Resets the Result display
				}
				else if(bin == true)
				{
					binTemp = ResultBin.getText();
					ResultBin.setText("");
				}
				
				else if (hex == true)
				{
					tempHex = ResultHex.getText();
					ResultHex.setText("");
				}
				else if (oct == true)
				{
					octTemp = ResultOct.getText(); 
					ResultOct.setText("");
				}
				addBool = true;	
			}
			
		}
		
		class ListentoSubtract implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dec == true)
				{
				TEMP = Double.parseDouble(Result.getText());
				Result.setText("");
				}
				
				else if (bin == true)
				{
					
						binTemp = ResultBin.getText();
						ResultBin.setText("");
				}
				else if (hex == true)
				{
					tempHex = ResultHex.getText();
					ResultHex.setText("");
				}
				else if (oct == true)
				{
					octTemp = ResultOct.getText(); 
					ResultOct.setText("");
				}
				
				subBool = true; 
			}	
		}
		class ListentoMultiply implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			if (dec == true)
			{
			TEMP = Double.parseDouble(Result.getText());
			Result.setText("");
			}
			else if (bin == true)
			{
				binTemp = ResultBin.getText();
				ResultBin.setText(""); 
			}
			else if (hex == true)
			{
				tempHex = ResultHex.getText();
				ResultHex.setText("");
			}
			else if (oct == true)
			{
				octTemp = ResultOct.getText(); 
				ResultOct.setText("");
			}
			
			mulBool = true;
			}
			}
		
		class ListentoDivide implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (dec == true)
				{
				TEMP = Double.parseDouble(Result.getText());
				Result.setText("");
				}
				else if (bin == true)
					{
						binTemp = ResultBin.getText();
						ResultBin.setText(""); 
					}
				else if (hex == true)
				{
					tempHex = ResultHex.getText();
					ResultHex.setText("");
				}
				else if (oct == true)
				{
					octTemp = ResultOct.getText(); 
					ResultOct.setText("");
				}
				
				divBool = true;
			}
		}
		
		class ListentoMOD implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dec == true)
				{
				TEMP = Double.parseDouble(Result.getText());
				Result.setText("");
				}
				else if (bin == true)
					{
						binTemp = ResultBin.getText();
						ResultBin.setText(""); 
					}
				else if (hex == true)
				{
					tempHex = ResultHex.getText();
					ResultHex.setText("");
				}
				else if (oct == true)
				{
					octTemp = ResultOct.getText(); 
					ResultOct.setText("");
				}
				modBool = true; 
				
			}
			
		}
		
		class ListentoSignChange implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dec == true)
				{
				Result.setText("-" + display);
				}
				final_Eql = false; 
				
			}
			
		}
		
		class ListentoSolve implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (dec == true)
				{
				SolveTemp = Double.parseDouble(Result.getText());
				if(addBool == true)
				{
					SolveTemp = SolveTemp + TEMP;
				}
				else if (subBool==true)
				{
					SolveTemp = TEMP - SolveTemp;
				}
				else if (mulBool == true)
				{
					SolveTemp = SolveTemp * TEMP;
				}
				else if (divBool == true)
				{
					try {
					SolveTemp = TEMP / SolveTemp; 
					}
					catch(ArithmeticException SolveTemp)
					{
						System.out.println("Error Cannot divide by zero!");
					}
				}
				else if (modBool == true)
				{
					SolveTemp = TEMP%SolveTemp; 
				}
				int dec = (int) SolveTemp;
				if (dec >=0)
				{
				String bin = binaryConverter(dec); 
				String hex = dec2Hex(dec); 
				String Oct = toOctal(dec); 
				Result.setText(Double.toString(SolveTemp));
				ResultBin.setText(bin);
				ResultHex.setText(hex);
				ResultOct.setText(Oct);
				}
				
				else
				{
					Result.setText(Double.toString(SolveTemp));
					StringBuffer bin = new StringBuffer(binaryConverter(dec)); 
					ResultBin.setText(findTwoscomplement(bin));
					String hex = dec2Hex(dec); 
					ResultHex.setText(hex);
					String Oct = toOctal(dec);
					ResultOct.setText(Oct);
					
				}
				}
				else if(bin == true)
				{
					binSolveTemp = ResultBin.getText();
				 if (addBool == true)
				 {
					 String binAns =addBinary(binSolveTemp, binTemp); 
					 ResultBin.setText(binAns); 
					 int dec = bin2Dec(binAns);
					 String dec2 = (Integer.toString(dec));
					 Result.setText("Dec: " + dec2);
					 String hex = dec2Hex(dec);
					 ResultHex.setText("Hex: 0x" +hex);
					 String Oct = toOctal(dec);
					 ResultOct.setText("Oct: " + Oct); 
					 
				 }
				 else if(subBool == true)
				 {
					 String binAns =subBinary(binTemp, binSolveTemp); 
					 ResultBin.setText(binAns); 
					 int dec = bin2Dec(binAns);
					 String dec2 = (Integer.toString(dec));
					 Result.setText("Dec: " + dec2);
					 String hex = dec2Hex(dec);
					 ResultHex.setText("Hex: 0x" +hex);
					 String Oct = toOctal(dec);
					 ResultOct.setText("Oct: " + Oct); 
				 }
				 else if (mulBool ==  true)
				 {
					 String binAns = binMul(binSolveTemp, binTemp);
					 ResultBin.setText(binAns); 
					 int dec = bin2Dec(binAns);
					 String dec2 = (Integer.toString(dec));
					 Result.setText("Dec: " + dec2);
					 String hex = dec2Hex(dec);
					 ResultHex.setText("Hex: 0x" +hex);
					 String Oct = toOctal(dec);
					 ResultOct.setText("Oct: " + Oct);
					
				 }
				 else if (divBool == true)
				 {
					 String binAns = binDiv(binTemp, binSolveTemp);
					 ResultBin.setText(binAns); 
					 int dec = bin2Dec(binAns);
					 String dec2 = (Integer.toString(dec));
					 Result.setText("Dec: " + dec2);
					 String hex = dec2Hex(dec);
					 ResultHex.setText("Hex: 0x" +hex);
					 String Oct = toOctal(dec);
					 ResultOct.setText("Oct: " + Oct); 
				 }
				 else if (modBool == true)
				 {
					 String binAns = binMod(binTemp, binSolveTemp);
					 ResultBin.setText(binAns); 
					 int dec = bin2Dec(binAns);
					 String dec2 = (Integer.toString(dec));
					 Result.setText("Dec: " + dec2);
					 String hex = dec2Hex(dec);
					 ResultHex.setText("Hex: 0x" +hex);
					 String Oct = toOctal(dec);
					 ResultOct.setText("Oct: " + Oct); 
				 }
				}
				
				else if (hex == true)
				{
					SolveTemphex = ResultHex.getText();
					if(addBool == true)
					{
						String hexAns = hexAdd(tempHex, SolveTemphex); 
						ResultHex.setText(hexAns);
						int dec = hex2Dec(hexAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						String Oct = toOctal(dec);
						 ResultOct.setText("Oct: " + Oct); 
						
					}
					
					
					else if (subBool == true)
					{
						String hexAns = hexSub(tempHex, SolveTemphex); 
						ResultHex.setText(hexAns);
						int dec = hex2Dec(hexAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						String Oct = toOctal(dec);
						 ResultOct.setText("Oct: " + Oct); 
						
					}
					
					else if (mulBool == true)
					{
						String hexAns = hexMul(tempHex, SolveTemphex); 
						ResultHex.setText(hexAns);
						int dec = hex2Dec(hexAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						String Oct = toOctal(dec);
						 ResultOct.setText("Oct: " + Oct);
					}
					
					else if(divBool == true)
					{
						String hexAns = hexDiv(tempHex, SolveTemphex); 
						ResultHex.setText(hexAns);
						int dec = hex2Dec(hexAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						String Oct = toOctal(dec);
						 ResultOct.setText("Oct: " + Oct);
					}
					else if(modBool == true)
					{
						String hexAns = hexMod(tempHex, SolveTemphex); 
						ResultHex.setText(hexAns);
						int dec = hex2Dec(hexAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						String Oct = toOctal(dec);
						 ResultOct.setText("Oct: " + Oct);
					}
				}
				
				else if (oct == true)
				{
					octSolveTemp = ResultOct.getText();
					if(addBool == true)
					{
						String octAns = octAdd(octTemp, octSolveTemp); 
						ResultOct.setText(octAns);
						int dec = oct2Dec(octAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						 String hex = dec2Hex(dec);
						 ResultHex.setText("Hex: 0x" +hex);
						
					}
					
					
					if(subBool == true)
					{
						String octAns = octSub(octTemp, octSolveTemp); 
						ResultOct.setText(octAns);
						int dec = oct2Dec(octAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						 String hex = dec2Hex(dec);
						 ResultHex.setText("Hex: 0x" +hex);
						
					}
					
					
					if(mulBool == true)
					{
						String octAns = octMul(octTemp, octSolveTemp); 
						ResultOct.setText(octAns);
						int dec = oct2Dec(octAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						 String hex = dec2Hex(dec);
						 ResultHex.setText("Hex: 0x" +hex);
						
					}
					
					
					if(divBool == true)
					{
						String octAns = octDiv(octTemp, octSolveTemp); 
						ResultOct.setText(octAns);
						int dec = oct2Dec(octAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						 String hex = dec2Hex(dec);
						 ResultHex.setText("Hex: 0x" +hex);
						
					}
					
					if(modBool == true)
					{
						String octAns = octMod(octTemp, octSolveTemp); 
						ResultOct.setText(octAns);
						int dec = oct2Dec(octAns);
						String dec2 =(Integer.toString(dec)); 
						Result.setText("Dec: " + dec2);
						String bin = binaryConverter(dec);
						ResultBin.setText("Bin: " + bin);
						 String hex = dec2Hex(dec);
						 ResultHex.setText("Hex: 0x" +hex);
						
					}
				}
				addBool = false;
				subBool = false;
				mulBool = false;
				divBool = false;
				modBool = false; 
				final_Eql = true; 
			
			}
		
	}
	
	public static void main(String args[])
	{
		Cal_program acchedin_cal = new Cal_program( );
		acchedin_cal.pack();
		acchedin_cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		acchedin_cal.setVisible(true);
		
	}
	
	
}









