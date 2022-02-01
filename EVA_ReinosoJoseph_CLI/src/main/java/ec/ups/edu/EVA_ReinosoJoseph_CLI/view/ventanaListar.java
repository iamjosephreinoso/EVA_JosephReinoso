package ec.ups.edu.EVA_ReinosoJoseph_CLI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasServiceSOAP;
import ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasServiceSOAPService;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class ventanaListar extends JFrame {

	private JPanel contentPane;
	private JTextArea txtLista;
	private static final QName SERVICE_NAME = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "ObrasServiceSOAPService");
	private static ObrasServiceSOAP port;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		URL wsdlURL = ObrasServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        ObrasServiceSOAPService ss = new ObrasServiceSOAPService(wsdlURL, SERVICE_NAME);
        port = ss.getObrasServiceSOAPPort();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaListar frame = new ventanaListar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaListar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Obras de Arte");
		lblNewLabel.setBounds(161, 22, 168, 13);
		contentPane.add(lblNewLabel);
		
		txtLista = new JTextArea();
		txtLista.setBounds(10, 46, 416, 180);
		contentPane.add(txtLista);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
			}
		});
		btnListar.setBounds(180, 236, 85, 21);
		contentPane.add(btnListar);
	}
	public void listar(){
		 java.util.List<ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasArte> _getObras__return = port.getObras();
	        System.out.println("getObras.result=" + _getObras__return);
	        for(int i = 0; i<_getObras__return.size();i++) {
	        	txtLista.append(_getObras__return.toString()+"\n");
	        }
	}
}
