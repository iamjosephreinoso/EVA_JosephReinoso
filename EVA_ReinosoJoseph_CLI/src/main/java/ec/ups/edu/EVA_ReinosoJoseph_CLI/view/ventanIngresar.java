package ec.ups.edu.EVA_ReinosoJoseph_CLI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasArte;
import ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasServiceSOAP;
import ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasServiceSOAPService;
import ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasServiceSOAP_ObrasServiceSOAPPort_Client;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class ventanIngresar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtAutor;
	private JTextField txtAnio;
	private JTextField txtDescripcion;
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
					ventanIngresar frame = new ventanIngresar();
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
	public ventanIngresar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar Obra");
		lblNewLabel.setBounds(10, 31, 181, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(10, 69, 92, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		lblNewLabel_2.setBounds(10, 117, 92, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("A\u00F1o:");
		lblNewLabel_3.setBounds(10, 161, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Descripcion:");
		lblNewLabel_4.setBounds(10, 219, 92, 13);
		contentPane.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(150, 66, 96, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(150, 114, 96, 19);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtAnio = new JTextField();
		txtAnio.setBounds(150, 158, 96, 19);
		contentPane.add(txtAnio);
		txtAnio.setColumns(10);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(150, 216, 324, 19);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Ingresar();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnIngresar.setBounds(175, 298, 85, 21);
		contentPane.add(btnIngresar);
	}
	
	public ObrasArte Ingresar() throws Exception {
		ObrasArte o = new ObrasArte();
		o.setAnio(txtAnio.getText());
		o.setAutor(txtAutor.getText());
		o.setDescripcion(txtDescripcion.getText());
		o.setNombre(txtNombre.getText());
		System.out.println("Invoking crearObra...");
        //ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasArte obra = o;
        
		java.lang.String _crearObra__return = port.crearObra(o);
        System.out.println("crearObra.result=" + _crearObra__return);
		return o;
	}
}
