import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CafeManagementSystem extends JFrame implements ActionListener
{
	JLabel jtitle;
	JLabel espresso,valecoffe,icedlatte,cappuccino,americancoffee,icedcappuccino;
	JTextField jespresso,jvalecoffe,jicedlatte,jcappuccino,jamericancoffee,jicedcappuccino;
	JLabel redvelvetcake,pineapplecake,blackforestcake,hazelnutcake,dutchchocolatecake,cheesecake;
	JTextField jredvelvetcake,jpineapplecake,jblackforestcake,jhazelnutcake,jdutchchocolatecake,jcheesecake;
	JLabel costofdrinks,costofcakes,subtotal,paidtax,servicecharge,totalcost;
	JTextField jcostofdrinks,jcostofcakes,jsubtotal,jpaidtax,jservicecharge,jtotalcost;
	JButton total,receipt,reset;
	JTextArea textarea;
	public CafeManagementSystem()
	{
		setLayout(null);
		setSize(1200,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//labels
		jtitle = new JLabel("CAFE MANAGEMENT SYSTEM");
		espresso = new JLabel("Espresso");
		valecoffe = new JLabel("Vale Coffee");
		icedlatte = new JLabel("Iced latte");
		cappuccino = new JLabel("Cappuccino");
		americancoffee = new JLabel("American Coffee");
		icedcappuccino = new JLabel("Iced Cappuccino");
		redvelvetcake = new JLabel("Red Velvet Cake");
		pineapplecake = new JLabel("Pineapple Cake");
		blackforestcake = new JLabel("Black Forest Cake");
		hazelnutcake = new JLabel("Hazelnut Cake");
		dutchchocolatecake = new JLabel("Dutch Chocolate Cake");
		cheesecake = new JLabel("Cheese Cake");
		costofcakes = new JLabel("Cost of Cakes");
		costofdrinks = new JLabel("Cost of Drinks");
		subtotal = new JLabel("Sub Total");
		paidtax = new JLabel("Paid Tax");
		servicecharge = new JLabel("Service Charge");
		totalcost =  new JLabel("Total Cost");
		//textfield and textarea 
		jespresso = new JTextField();
		jvalecoffe = new JTextField();
		jicedlatte = new JTextField();
		jcappuccino = new JTextField();
		jamericancoffee = new JTextField();
		jicedcappuccino = new JTextField();
		jredvelvetcake = new JTextField();
		jpineapplecake = new JTextField();
		jblackforestcake = new JTextField();
		jhazelnutcake = new JTextField();
		jdutchchocolatecake = new JTextField();
		jcheesecake = new JTextField();
		jcostofcakes = new JTextField();
		jcostofdrinks = new JTextField();
		jsubtotal = new JTextField();
		jpaidtax = new JTextField();
		jservicecharge = new JTextField();
		jtotalcost = new JTextField();
		total = new JButton("Total");
		receipt = new JButton("Receipt");
		reset = new JButton("Reset");
		textarea = new JTextArea();
		//setting font for component
		jtitle.setFont(new Font("Comic Sans MS",Font.PLAIN,50));
		Font f = new Font("Comic Sans MS",Font.PLAIN,20);
		espresso.setFont(f);
		valecoffe.setFont(f);
		icedlatte.setFont(f);
		cappuccino.setFont(f);
		americancoffee.setFont(f);
		icedcappuccino.setFont(f);
		redvelvetcake.setFont(f);
		pineapplecake.setFont(f);
		blackforestcake.setFont(f);
		hazelnutcake.setFont(f);
		dutchchocolatecake.setFont(f);
		cheesecake.setFont(f);
		costofcakes.setFont(f);
		costofdrinks.setFont(f);
		subtotal.setFont(f);
		paidtax.setFont(f);
		servicecharge.setFont(f);
		totalcost.setFont(f);
		textarea.setFont(new Font("Dubai Medium",Font.PLAIN,15));
		//adding components to the frame
		add(jtitle);
		add(espresso);
		add(valecoffe);
		add(icedlatte);
		add(cappuccino);
		add(americancoffee);
		add(icedcappuccino);
		add(redvelvetcake);
		add(pineapplecake);
		add(blackforestcake);
		add(hazelnutcake);
		add(dutchchocolatecake);
		add(cheesecake);
		add(costofcakes);
		add(costofdrinks);
		add(subtotal);
		add(paidtax);
		add(servicecharge);
		add(totalcost);
		add(jredvelvetcake);
		add(jpineapplecake);
		add(jblackforestcake);
		add(jhazelnutcake);
		add(jdutchchocolatecake);
		add(jcheesecake);
		add(jespresso);
		add(jvalecoffe);
		add(jicedlatte);
		add(jcappuccino);
		add(jamericancoffee);
		add(jicedcappuccino);
		add(jcostofcakes);
		add(jcostofdrinks);
		add(jsubtotal);
		add(jpaidtax);
		add(jservicecharge);
		add(jtotalcost);
		add(total);
		add(receipt);
		add(reset);
		add(textarea);
		// alignment for components 
		jtitle.setBounds(260,5,1000,100);
		espresso.setBounds(50,110,150,30);
		jespresso.setBounds(250,110,150,30);
		valecoffe.setBounds(50,160,150,30);
		jvalecoffe.setBounds(250,160,150,30);
		icedlatte.setBounds(50,210,150,30);
		jicedlatte.setBounds(250,210,150,30);
		cappuccino.setBounds(50,260,150,30);
		jcappuccino.setBounds(250,260,150,30);
		americancoffee.setBounds(50,310,200,30);
		jamericancoffee.setBounds(250,310,150,30);
		icedcappuccino.setBounds(50,360,200,30);
		jicedcappuccino.setBounds(250,360,150,30);
		redvelvetcake.setBounds(450,110,200,30);
		jredvelvetcake.setBounds(680,110,150,30);
		pineapplecake.setBounds(450,160,200,30);
		jpineapplecake.setBounds(680,160,150,30);
		blackforestcake.setBounds(450,210,200,30);
		jblackforestcake.setBounds(680,210,150,30);
		hazelnutcake.setBounds(450,260,200,30);
		jhazelnutcake.setBounds(680,260,150,30);
		dutchchocolatecake.setBounds(450,310,230,30);
		jdutchchocolatecake.setBounds(680,310,150,30);
		cheesecake.setBounds(450,360,200,30);
		jcheesecake.setBounds(680,360,150,30);
		costofcakes.setBounds(50,440,150,30);
		jcostofcakes.setBounds(250,440,150,30);
		costofdrinks.setBounds(50,490,150,30);
		jcostofdrinks.setBounds(250,490,150,30);
		subtotal.setBounds(50,540,150,30);
		jsubtotal.setBounds(250,540,150,30);
		paidtax.setBounds(450,440,150,30);
		jpaidtax.setBounds(680,440,150,30);
		servicecharge.setBounds(450,490,150,30);
		jservicecharge.setBounds(680,490,150,30);
		totalcost.setBounds(450,540,150,30);
		jtotalcost.setBounds(680,540,150,30);
		total.setBounds(50,600,150,30);	
		receipt.setBounds(300,600,150,30);
		reset.setBounds(550,600,150,30);
		textarea.setBounds(850,110,320,520);
		//default value as '0'
		jespresso.setText("0");
		jvalecoffe.setText("0");
		jicedlatte.setText("0");
		jcappuccino.setText("0");
		jamericancoffee.setText("0");
		jicedcappuccino.setText("0");
		jredvelvetcake.setText("0");
		jpineapplecake.setText("0");
		jblackforestcake.setText("0");
		jhazelnutcake.setText("0");
		jdutchchocolatecake.setText("0");
		jcheesecake.setText("0");
		jservicecharge.setText("50");
		//adding action listener
		total.addActionListener(this);
		receipt.addActionListener(this);
		reset.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str="";
		int num,subprice=0,totalprice=0,priceofdrinks=0,priceofcakes=0;
		if(e.getSource()==receipt)
		{
			str = "                         Cafe Management System\n";
			str += "========================================\n";
			str += " Items                            Quantity                             Price\n";
			if(Integer.parseInt(jespresso.getText())>0)
			{
				num = Integer.parseInt(jespresso.getText());
				priceofdrinks+=(num*100);
				str += " Espresso                             "+num+"                                      "+(num*100)+"\n";
			}
			if(Integer.parseInt(jvalecoffe.getText())>0)
			{
				num = Integer.parseInt(jvalecoffe.getText());
				priceofdrinks+=(num*150);
				str += " Vale Coffee                        "+num+"                                      "+(num*150)+"\n";
			}
			if(Integer.parseInt(jicedlatte.getText())>0)
			{
				num = Integer.parseInt(jicedlatte.getText());	
				priceofdrinks+=(num*500);
				str += " Iced Latte                           "+num+"                                      "+(num*500)+"\n";
			}
			if(Integer.parseInt(jcappuccino.getText())>0)
			{
				num = Integer.parseInt(jcappuccino.getText());	
				priceofdrinks+=(num*175);
				str += " Cappuccino                        "+num+"                                      "+(num*175)+"\n";
			}
			if(Integer.parseInt(jamericancoffee.getText())>0)
			{
				num = Integer.parseInt(jamericancoffee.getText());
				priceofdrinks+=(num*215);
				str += " American Coffee              "+num+"                                      "+(num*215)+"\n";
			}
			if(Integer.parseInt(jicedcappuccino.getText())>0)
			{
				num = Integer.parseInt(jicedcappuccino.getText());
				priceofdrinks+=(num*200);
				str += " Iced Cappuccino               "+num+"                                      "+(num*200)+"\n";
			}
			if(Integer.parseInt(jredvelvetcake.getText())>0)
			{
				num = Integer.parseInt(jredvelvetcake.getText());
				priceofcakes+=(num*380);
				str += " Red Velvet Cake               "+num+"                                      "+(num*380)+"\n";
			}
			if(Integer.parseInt(jpineapplecake.getText())>0)
			{
				num = Integer.parseInt(jpineapplecake.getText());
				priceofcakes+=(num*250);	
				str += " Pineapple Cake                 "+num+"                                      "+(num*250)+"\n";
			}
			if(Integer.parseInt(jblackforestcake.getText())>0)
			{
				num = Integer.parseInt(jblackforestcake.getText());				
				priceofcakes+=(num*545);
				str += " Black Forest Cake            "+num+"                                      "+(num*545)+"\n";
			}
			if(Integer.parseInt(jhazelnutcake.getText())>0)
			{
				num = Integer.parseInt(jhazelnutcake.getText());				
				priceofcakes+=(num*845);
				str += " Hazelnut Cake                  "+num+"                                      "+(num*845)+"\n";
			}
			if(Integer.parseInt(jdutchchocolatecake.getText())>0)
			{
				num = Integer.parseInt(jdutchchocolatecake.getText());				
				priceofcakes+=(num*680);
				str += " Dutch Chocolate Cake    "+num+"                                      "+(num*680)+"\n";
			}
			if(Integer.parseInt(jcheesecake.getText())>0)
			{
				num = Integer.parseInt(jcheesecake.getText());				
				priceofcakes+=(num*700);
				str += " Cheese Cake                      "+num+"                                      "+(num*700)+"\n";
			}
			subprice = (priceofdrinks+priceofcakes);
			totalprice += (subprice*0.18) + subprice + 50;
			str += "========================================\n";
			str += " Total Price     =      "+totalprice+"\n";
			str += "========================================\n";
			textarea.setText(str);
		}
		if(e.getSource()==total)
		{
			subprice=0;
			totalprice=0;
			priceofdrinks=0;
			priceofcakes=0;
			if(Integer.parseInt(jespresso.getText())>0)
			{
				num = Integer.parseInt(jespresso.getText());
				priceofdrinks+=(num*100);
			}
			if(Integer.parseInt(jvalecoffe.getText())>0)
			{
				num = Integer.parseInt(jvalecoffe.getText());
				priceofdrinks+=(num*150);
			}
			if(Integer.parseInt(jicedlatte.getText())>0)
			{
				num = Integer.parseInt(jicedlatte.getText());	
				priceofdrinks+=(num*500);
			}
			if(Integer.parseInt(jcappuccino.getText())>0)
			{
				num = Integer.parseInt(jcappuccino.getText());	
				priceofdrinks+=(num*175);
			}
			if(Integer.parseInt(jamericancoffee.getText())>0)
			{
				num = Integer.parseInt(jamericancoffee.getText());
				priceofdrinks+=(num*215);
			}
			if(Integer.parseInt(jicedcappuccino.getText())>0)
			{
				num = Integer.parseInt(jicedcappuccino.getText());
				priceofdrinks+=(num*200);
			}
			if(Integer.parseInt(jredvelvetcake.getText())>0)
			{
				num = Integer.parseInt(jredvelvetcake.getText());
				priceofcakes+=(num*380);
			}
			if(Integer.parseInt(jpineapplecake.getText())>0)
			{
				num = Integer.parseInt(jpineapplecake.getText());
				priceofcakes+=(num*250);	
			}
			if(Integer.parseInt(jblackforestcake.getText())>0)
			{
				num = Integer.parseInt(jblackforestcake.getText());				
				priceofcakes+=(num*545);
			}
			if(Integer.parseInt(jhazelnutcake.getText())>0)
			{
				num = Integer.parseInt(jhazelnutcake.getText());				
				priceofcakes+=(num*845);
			}
			if(Integer.parseInt(jdutchchocolatecake.getText())>0)
			{
				num = Integer.parseInt(jdutchchocolatecake.getText());				
				priceofcakes+=(num*680);
			}
			if(Integer.parseInt(jcheesecake.getText())>0)
			{
				num = Integer.parseInt(jcheesecake.getText());				
				priceofcakes+=(num*700);
			}
			subprice = (priceofdrinks+priceofcakes);
			totalprice += (subprice*0.18) + subprice + 50;
			jcostofcakes.setText(""+priceofcakes);
			jcostofdrinks.setText(""+priceofdrinks);
			jsubtotal.setText(""+subprice);
			jpaidtax.setText(""+(subprice*0.18));
			jtotalcost.setText(""+totalprice);
		}
		if(e.getSource()==reset)
		{
			textarea.setText("");
			jcostofcakes.setText("");
			jcostofdrinks.setText("");
			jsubtotal.setText("");
			jtotalcost.setText("");
			jpaidtax.setText("");
			jespresso.setText("0");
			jvalecoffe.setText("0");
			jicedlatte.setText("0");
			jcappuccino.setText("0");
			jamericancoffee.setText("0");
			jicedcappuccino.setText("0");
			jredvelvetcake.setText("0");
			jpineapplecake.setText("0");
			jblackforestcake.setText("0");
			jhazelnutcake.setText("0");
			jdutchchocolatecake.setText("0");
			jcheesecake.setText("0");
		}
	}
	public static void main(String args[])
	{
		CafeManagementSystem cms = new CafeManagementSystem();
	}
}