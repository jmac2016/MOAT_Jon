package main;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
public class ClockAnimation extends JPanel {
	private JLabel jtext1 = new JLabel();
	private Long initialTime = null;
	Timer time1 = null;
	public ClockAnimation(){
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
		Date date = null;
		Date date2 = null;
		Calendar c1 = null;
		try {
			date = new Date();
			date2 = sdf1.parse("2015-11-27 19:20:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initialTime = (long) (((date2.getTime() - System.currentTimeMillis())) * .001);;
		System.out.println("Current Time: " + System.currentTimeMillis());
		System.out.println("Specified Time: " + date2.toString());
		jtext1.setText(initialTime.toString());
		add(jtext1);
		
		time1 = new Timer(1000, new TimerListener());
		time1.start();
		
		
	}
	
	private class TimerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			if(initialTime == 0){
				time1.stop();
				System.out.println("Hello");
			}
			else{
				System.out.println(initialTime);
				initialTime--;
				jtext1.setText(initialTime.toString());
			}
			
			/*if(initialTime == 0){
				time1.stop();
			}*/
		}
	}
}
