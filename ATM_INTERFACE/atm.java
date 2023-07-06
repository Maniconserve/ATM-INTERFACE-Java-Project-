import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class atm implements ActionListener {
    Frame f1,f2,f3,f4,f5,f6;
    TextField cn,amount,amount1,ac_no,ifsc_code,amount2;
    JPasswordField pin,otp,pin1,pin2,pin3,pin4,pin6;
    public static JLabel l,a,p,tp,q,w,r,s,t,b,c,d,f,a1,g,h,i,j,k,m;
    public static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    public static JButton back,back1,back2,back3,back4;
    atm() {
        f1 = new Frame();
        f1.setTitle("Welcome To ATM service");
        f1.setSize(400, 400);
        f1.setLayout(new GridLayout(3, 1));
        l = new JLabel("Insert Your Card");
        f1.add(l);
        b1 = new JButton("English");
        b1.addActionListener(this);
        f1.add(b1);
        b2 = new JButton("Hindi");
        b2.addActionListener(this);
        f1.add(b2);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            f2 = new Frame("Select an option:");
            f2.setLayout(new GridLayout(4,2));
            f2.setSize(500,500);
            b3 = new JButton("cash withdrawl");
            b4 = new JButton("Credit Card Payment");
            b5 = new JButton("Change Pin Number");
            b6 = new JButton("Balance Enquiry");
            b7 = new JButton("Transfer Money");
            b8 = new JButton("Deposit");
            b9 = new JButton("other services");
            f2.add(b3);
            f2.add(b4);
            f2.add(b5);
            f2.add(b6);
            f2.add(b7);
            f2.add(b8);
            f2.add(b9);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);

            back  = new JButton("back");
            back.addActionListener(this);
            f2.add(back);

            f2.setVisible(true);
            f1.setVisible(false);
        }else if(e.getSource()==b3){
            f2.setVisible(false);

            f3 = new Frame("Withdrawl");
            f3.setSize(400,300);
            f3.setLayout(new GridLayout(3,2));

            a = new JLabel("Enter Amount");
            a.setBounds(50,50,125,25);
            f3.add(a);

            amount = new TextField();
            amount.setBounds(180,100,120,25);
            f3.add(amount);

            b17 = new JButton("SUBMIT");
            b17.setBounds(180,100,120,25);
            b17.addActionListener(this);
            f3.add(b17);

            back1 = new JButton("back");
            back1.addActionListener(this);
            f3.add(back1);

            f3.setVisible(true);
        }
        else if(e.getSource()==b17){
            f3.setVisible(false);
            String x = new String(amount.getText());
            if(x.isEmpty()){
                JOptionPane.showMessageDialog(null,"Amount can't be empty");
            }else{
                f4 = new Frame("PIN");
                f4.setSize(400,300);
                f4.setLayout(new GridLayout(3,2));

                p = new JLabel("Enter your Pin:");
                p.setBounds(180,100,120,25);
                f4.add(p);

                pin = new JPasswordField();
                pin.setBounds(180,100,120,25);
                f4.add(pin);

                b18 = new JButton("Yes Correct");
                b18.setBounds(180,100,120,25);
                b18.addActionListener(this);
                f4.add(b18);

                back2 = new JButton("back");
                back2.addActionListener(this);
                f4.add(back2);
            }
            f3.setVisible(true);
            f4.setVisible(true);
        }
        else if(e.getSource()==b18){
            String w = new String(pin.getPassword());
            if(w.isEmpty()){
                JOptionPane.showMessageDialog(null,"pin can't be empty");
            }else{
                f5 = new Frame("Transaction Processing");
                f5.setSize(400,400);
                f5.setLayout(null);
                tp = new JLabel("Transaction is Processing "+"\n"+"Please wait");
                tp.setBounds(100,100,250,25);
                f5.add(tp);
                f4.setVisible(false);
                f5.setVisible(true);
            }
        }
        else if(e.getSource()==b4){
            f2.setVisible(false);

            f3 = new Frame("Credit Card Payment");
            f3.setSize(400,300);
            f3.setLayout(new GridLayout(4,2));

            q = new JLabel("Enter Crad Number:");
            q.setBounds(180,50,120,25);
            f3.add(q);

            cn = new TextField();
            cn.setBounds(180,50,120,25);
            f3.add(cn);

            b25 = new JButton("SUBMIT");
            b25.setBounds(180,100,120,25);
            b25.addActionListener(this);
            f3.add(b25);

            back1 = new JButton("back");
            back1.addActionListener(this);
            f3.add(back1);

            f3.setVisible(true);
        }
        else if(e.getSource() == b25){
            f3.setVisible(false);
            String y = new String(cn.getText());
            if(y.isEmpty()){
                JOptionPane.showMessageDialog(null, "CARD NO. Can't be Empty");
            }else{
                f4 = new Frame("amount");
                f4.setSize(400,300);
                f4.setLayout(new GridLayout(4, 2));

                a1 = new JLabel("Enter amount: ");
                a1 .setBounds(50, 50, 125, 25);
                f4.add(a1);

                amount1 = new TextField();
                amount1.setBounds(180, 50, 120, 25);
                f4.add(amount1);

                b26 = new JButton("SUBMIT");
                b26.setBounds(180, 100, 120, 25);
                b26.addActionListener(this);
                f4.add(b26);

                back2 = new JButton("back");
                back2.addActionListener(this);
                f4.add(back2);

                f4.setVisible(true);
            }

        }
        else if(e.getSource() == b26){
            f4.setVisible(false);
            String j = new String(amount1.getText());
            if(j.isEmpty()){
                JOptionPane.showMessageDialog(null, "AMOUNT Can't be Empty");
            }else{
                f5 = new Frame("PIN");
                f5.setSize(400,300);
                f5.setLayout(new GridLayout(4,2));

                g = new JLabel("Enter PIN");
                g.setBounds(50,50,120,25);
                f5.add(g);

                pin4 = new JPasswordField();
                pin4.setBounds(180, 100, 120, 25);
                f5.add(pin4);

                b27 = new JButton("YES, Correct");
                b27.setBounds(180, 100, 120, 25);
                b27.addActionListener(this);
                f5.add(b27);

                back3 = new JButton("back");
                back3.addActionListener(this);
                f5.add(back3);

                f5.setVisible(true);

            }
        }
        else if(e.getSource() == b27){
            f5.setVisible(false);
            String k = new String(pin4.getPassword());
            if(k.isEmpty()){
                JOptionPane.showMessageDialog(null, "PIN Can't be Empty");
            }else{
                f6 = new Frame("Processing");
                f6.setSize(400,300);
                f6.setLayout(null);

                h = new JLabel("Payment Succesfull");
                h.setBounds(100,100 , 250, 25);
                f6.add(h);
                f5.setVisible(false);
                f6.setVisible(true);
            }
        }
        else if(e.getSource() == b5){
            f2.setVisible(false);

            f3 = new Frame("CHNAGE PIN NUMBER");
            f3.setSize(400,300);
            f3.setLayout(new GridLayout(4,2));

            w = new JLabel("OLD PIN NUMBER ");
            w .setBounds(50, 50, 125, 25);
            f3.add(w);

            pin1 = new JPasswordField();
            pin1.setBounds(180, 50, 120, 25);
            f3.add(pin1);

            r = new JLabel("NEW PIN NUMBER ");
            r .setBounds(50, 50, 125, 25);
            f3.add(r);

            pin2= new JPasswordField();
            pin2.setBounds(180, 50, 120, 25);
            f3.add(pin2);

            b19 = new JButton("SUBMIT");
            b19.setBounds(180, 100, 120, 25);
            b19.addActionListener(this);
            f3.add(b19);

            back1 = new JButton("back");
            back1.addActionListener(this);
            f3.add(back1);

            f3.setVisible(true);

        }else if(e.getSource() == b19){
            String z = new String(pin1.getPassword());
            if(z.isEmpty()){
                JOptionPane.showMessageDialog(null, "PIN1 Number cant be empty");
            }
            String a = new String(pin2.getPassword());
            if(a.isEmpty()){
                JOptionPane.showMessageDialog(null, "PIN2 Number cant be empty");
            }else{
                f2.setVisible(false);
                f3 = new Frame("OTP VERIFICATION");
                f3.setSize(400,300);
                f3.setLayout(new GridLayout(3,2));

                t = new JLabel("ENTER OTP: ");
                t.setBounds(50, 50, 125, 25);
                f3.add(t);

                otp = new JPasswordField();
                otp.setBounds(180, 50, 120, 25);
                f3.add(otp);

                b20 = new JButton("YES, Correct");
                b20.setBounds(200, 150, 120, 25);
                b20.addActionListener(this);
                f3.add(b20);

                back3 = new JButton("back");
                back3.addActionListener(this);
                f3.add(back3);

                f3.setVisible(true);
            }


        }
        else if(e.getSource() == b20){
            f3.setVisible(true);

            String d = new String(otp.getPassword());
            if(d.isEmpty()){
                JOptionPane.showMessageDialog(null, " OTP can't be empty");
            }else{
                f4 = new Frame("processing verification");
                f4.setSize(400,300);
                f4.setLayout(null);

                s = new JLabel("OTP VERIFIED \t"+"Thank you!");
                s.setBounds(100, 100, 250, 25);
                f4.add(s);

                f3.setVisible(false);
                f4.setVisible(true);
            }


        }else if(e.getSource() == b6){
            f2.setVisible(false);

            f3 = new Frame("BALANCE ENQUIRY");
            f3.setSize(400,300);
            f3.setLayout(new GridLayout(3,2));

            a = new JLabel("Enter PIN: ");
            a.setBounds(50, 50, 125, 25);
            f3.add(a);

            pin3 = new JPasswordField();
            pin3.setBounds(180, 50, 120, 25);
            f3.add(pin3);

            b21 = new JButton("SUBMIT");
            b21.setBounds(180, 100, 120, 25);
            b21.addActionListener(this);
            f3.add(b21);

            back1 = new JButton("back");
            back1.addActionListener(this);
            f3.add(back1);

            f3.setVisible(true);

        }
        else if(e.getSource() == b21){
            f3.setVisible(false);
            String f = new String(pin3.getPassword());
            if(f.isEmpty()){
                JOptionPane.showMessageDialog(null, " pin cant be empty");
            }else{
                f4 = new Frame("BALANCE");
                f4.setSize(400,300);
                f4.setLayout(null);

                s = new JLabel("Your Balance is:");
                s.setBounds(100, 100, 250, 100);
                f4.add(s);

                f3.setVisible(false);
                f4.setVisible(true);
            }
        }
        else if(e.getSource() == b7){
            f2.setVisible(false);

            f3 = new Frame("Transfer Money");
            f3.setSize(400,300);
            f3.setLayout(new GridLayout(3,2));

            f= new JLabel("Enter back account number : ");
            f.setBounds(50, 50, 125, 25);
            f3.add(f);

            ac_no= new TextField();
            ac_no.setBounds(180, 50, 120, 25);
            f3.add(ac_no);

            b22 = new JButton("SUBMIT");
            b22.setBounds(180, 100, 120, 25);
            b22.addActionListener(this);
            f3.add(b22);

            back1 = new JButton("back");
            back1.addActionListener(this);
            f3.add(back1);

            f3.setVisible(true);

        }else if(e.getSource()==b22){
            f3.setVisible(false);
            String g = new String(ac_no.getText());
            if(g.isEmpty()){
                JOptionPane.showMessageDialog(null, " ACC_NO. cant be empty");
            }else{
                f4 = new Frame("CODE");
                f4.setSize(400,300);
                f4.setLayout(new GridLayout(3,2));

                b = new JLabel(" Enter IFSC CODE : ");
                b.setBounds(50, 50, 125, 25);
                f4.add(b);

                ifsc_code = new TextField();
                ifsc_code.setBounds(180, 50, 120, 25);
                f4.add(ifsc_code);

                b23 = new JButton("SUBMIT");
                b23.setBounds(180, 100, 120, 25);
                b23.addActionListener(this);
                f4.add(b23);

                back2 = new JButton("back");
                back2.addActionListener(this);
                f4.add(back2);

                f4.setVisible(true);

            }
        }else if(e.getSource() == b23){
            f4.setVisible(false);
            String h = new String(ifsc_code.getText());
            if(h.isBlank()){
                JOptionPane.showMessageDialog(null, " IFSC CODE. cant be empty");
            }else{
                f5 = new Frame("PIN NUMBER");
                f5.setSize(400,300);
                f5.setLayout(new GridLayout(3,2));

                c = new JLabel(" PIN NUMBER : ");
                c.setBounds(50, 50, 125, 25);
                f5.add(c);

                pin3 = new JPasswordField();
                pin3.setBounds(180, 50, 120, 25);
                f5.add(pin3);

                b24 = new JButton("SUBMIT");
                b24.setBounds(180, 100, 120, 25);
                b24.addActionListener(this);
                f5.add(b24);

                back3= new JButton("back");
                back3.addActionListener(this);
                f5.add(back3);

                f5.setVisible(true);
            }
        }
        else if(e.getSource() == b24){
            f5.setVisible(false);
            String i = new String(pin3.getPassword());
            if(i.isEmpty()){
                JOptionPane.showMessageDialog(null, " PIN cant be empty");
            }else{
                f6 = new Frame();
                f6.setSize(400,300);
                f6.setLayout(null);

                d = new JLabel("Amount Transfered Succesfully");
                d.setBounds(100, 100, 250, 25);
                f6.add(d);

                f5.setVisible(false);
                f6.setVisible(true);
            }
        }
        else if(e.getSource() == b8){
            f2.setVisible(false);

            f3 = new Frame("PIN");
            f3.setSize(400,300);
            f3.setLayout(new GridLayout(3,2));

            i = new JLabel("Enter PIN: ");
            i.setBounds(50, 50, 125, 25);
            f3.add(i);

            pin6 = new JPasswordField();
            pin6.setBounds(180, 50, 120, 25);
            f3.add(pin6);

            b28 = new JButton("SUBMIT");
            b28.setBounds(180, 100, 120, 25);
            b28.addActionListener(this);
            f3.add(b28);

            back1 = new JButton("back");
            back1.addActionListener(this);
            f3.add(back1);

            f3.setVisible(true);
        }else if(e.getSource() == b28){
            f3.setVisible(false);
            String h = new String(pin6.getPassword());
            if(h.isEmpty()){
                JOptionPane.showMessageDialog(null, " PIN cant be empty");
            }else{
                f4 = new Frame("Amount");
                f4.setSize(400,300);
                f4.setLayout(new GridLayout(3, 2));

                j = new JLabel(" Enter AMOUNT: ");
                j.setBounds(50, 50, 125, 25);
                f4.add(j);

                amount2 = new TextField();
                amount2.setBounds(180, 50, 120, 25);
                f4.add(amount2);

                b29 = new JButton("SUBMIT");
                b29.setBounds(180, 100, 120, 25);
                b29.addActionListener(this);
                f4.add(b29);

                back2 = new JButton("back");
                back2.addActionListener(this);
                f4.add(back2);

                f4.setVisible(true);
            }
        }
        else if(e.getSource()==b29){
            f4.setVisible(false);
            String i = new String(amount2.getText());
            if(i.isEmpty()){
                JOptionPane.showMessageDialog(null, " PIN cant be empty");
            }else{
                f5 = new Frame("Deposit cash");
                f5.setSize(400,300);
                f5.setLayout(new GridLayout(3, 2));

                k = new JLabel(" insert cash in outlet of the atm Money ");
                k.setBounds(50, 50, 125, 25);
                f5.add(k);

                b30 = new JButton("SUBMIT");
                b30.setBounds(180, 100, 120, 25);
                b30.addActionListener(this);
                f5.add(b30);

                back3 = new JButton("back");
                back3.addActionListener(this);
                f5.add(back3);

                f5.setVisible(true);
            }

        }else if(e.getSource()==b30){
            f6 = new Frame();
            f6.setSize(400,300);
            f6.setLayout(null);

            m = new JLabel("Amount Transfered Succesfully");
            m.setBounds(100, 100, 250, 25);
            f6.add(m);

            f5.setVisible(false);
            f6.setVisible(true);
        }

        else if(e.getSource() == b2){
            f2 = new Frame("Select an Option");
            f2.setLayout(new GridLayout(4, 2));
            f2.setSize(500,500);
            b10 = new JButton("नकद निकासी");
            b11 = new JButton("क्रेडिट कार्ड से भुगतान");
            b12 = new JButton("पिन नंबर बदलें");
            b13 = new JButton("बैलेंस पूछताछ");
            b14= new JButton("धन हस्तांतरण");
            b15 = new JButton("कथन पूछताछ");
            b16= new JButton("अन्य सेवाएं");
            f2.add(b10);
            f2.add(b11);
            f2.add(b12);
            f2.add(b13);
            f2.add(b14);
            f2.add(b15);
            f2.add(b16);

            b10.addActionListener(this);
            b11.addActionListener(this);
            b12.addActionListener(this);
            b13.addActionListener(this);
            b14.addActionListener(this);
            b15.addActionListener(this);
            b16.addActionListener(this);

            back = new JButton("back");
            back.addActionListener(this);
            f2.add(back);

            f2.setVisible(true);
            f1.setVisible(false);

        }else if (e.getSource() == back) {
            f2.dispose();
            f1.setVisible(true);
        }else if(e.getSource() == back1){
            f3.dispose();
            f2.setVisible(true);
        }else if(e.getSource() == back2){
            f4.dispose();
            f3.setVisible(true);
        }else if(e.getSource() == back3){
            f5.dispose();
            f4.setVisible(true);
        }else if(e.getSource() == back4){
            f6.dispose();
            f5.setVisible(true);
        }
    }
}
