
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortEventListener;
import jssc.SerialPortList;

public class solution1 {
	public static void main(String[] args) {
		String[] portNames = SerialPortList.getPortNames();
		for(int i = 0; i < portNames.length; i++) {
			System.out.println(portNames[i]);
		}
		 SerialPort serialPort = new SerialPort("COM4"); 		//writing data to the COM4	
		    try {
		        serialPort.openPort();//Open serial port
		        serialPort.setParams(SerialPort.BAUDRATE_9600, 
		                             SerialPort.DATABITS_8,
		                             SerialPort.STOPBITS_1,
		                             SerialPort.PARITY_NONE);//Set params. Also you can set params by this string: serialPort.setParams(9600, 8, 1, 0);
		        serialPort.writeBytes("This is a test string".getBytes());//Write data to port
		        serialPort.closePort();//Close serial port
		    }
		    catch (SerialPortException ex) {
		        System.out.println(ex);
		    }
    SerialPort serialPort1 = new SerialPort("COM4");                // READING DATA FROM THE COM4		
    try {
        serialPort1.openPort();//Open serial port
        serialPort1.setParams(9600, 8, 1, 0);//Set params.
        byte[] buffer = serialPort1.readBytes(10);//Read 10 bytes from serial port
        serialPort1.closePort();//Close serial port
    }
    catch (SerialPortException ex) {
        System.out.println(ex);
    }

}
}
