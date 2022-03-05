package ma.fstm.ilisi2.ExpertSysCovid19.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sample.DroolsTest;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.awt.event.ActionEvent;
import java.awt.Font;
import ma.fstm.ilisi2.ExpertSysCovid19.model.*;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Cardiaque;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Client;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Diabete;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Diagnostic;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Etatpandemie;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.HyperTension;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Maladie;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.MaladieChronique;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Region;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Symptome;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Temperature;
import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.Ville;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
public class InterfaceEssaie extends JFrame  implements ActionListener{

	private JPanel contentPane;
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textAge;
	JPanel panel_1 ;
	JComboBox comboBox;
	String[] listevilles = {"Casablanca","Rabat","Salé","Merrakech","Meknass","Tanger"};
	private JTextField textTempérature;
	DefaultListModel<String> model = new DefaultListModel<String>();
	DefaultListModel<String> model1 = new DefaultListModel<String>();
	JLabel lbl_degre;
	JCheckBox check_Diabéte,check_HyperTendu,check_Cardiaque,check_contactC19;
	
	JList list;
	JList list_1;
	
	JButton btnSupprimer,btnSupprimer_tous;
	
	Diagnostic diagnostic ;
	ArrayList<Symptome> symptomes_client=new ArrayList<Symptome>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceEssaie frame = new InterfaceEssaie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void SetListSymptome_client() {
		model1.removeAllElements();
		for(Symptome s : symptomes_client)
			model1.addElement(s.getDescription());
	}
	public void SetListSymptome() {
		ArrayList<Symptome> list_Dessymptomes = new ArrayList<Symptome>();
        
		list_Dessymptomes.add(new Symptome("fievre"));
        list_Dessymptomes.add(new Symptome("fatigue"));
        list_Dessymptomes.add(new Symptome("toux sèche"));
        list_Dessymptomes.add(new Symptome("congestion nasal"));
        list_Dessymptomes.add(new Symptome("écoulement nasal"));
        list_Dessymptomes.add(new Symptome("maux de gorge"));
        list_Dessymptomes.add(new Symptome("diarrhé"));
        list_Dessymptomes.add(new Symptome("dyspnée"));
        list_Dessymptomes.add(new Symptome("douleurs musculaires"));
        list_Dessymptomes.add(new Symptome("maux de tete"));//
        list_Dessymptomes.add(new Symptome("frissons"));
        list_Dessymptomes.add(new Symptome("gorge sèche"));
        list_Dessymptomes.add(new Symptome("perte de goût"));
        list_Dessymptomes.add(new Symptome("perte de l'odorat"));
        list_Dessymptomes.add(new Symptome("essouflement"));
        list_Dessymptomes.add(new Symptome("confusion"));
        list_Dessymptomes.add(new Symptome("chute"));
        list_Dessymptomes.add(new Symptome("nausée"));
        list_Dessymptomes.add(new Symptome("vomissement"));
        list_Dessymptomes.add(new Symptome("conjonctivite"));
        list_Dessymptomes.add(new Symptome("tremblement répété"));
        
        for(Symptome s : list_Dessymptomes)
        {
        	model.addElement(s.getDescription());
        }
	}
	
	public Region get_region()
	{
		String ville = comboBox.getSelectedItem().toString();
		
		if(ville.equals("Casablanca"))
			return new Region("Casablance-Settat",new Etatpandemie("haut"));
		else
			if(ville.equals("Rabat"))
				return new Region("Rabat-Salé-Kenitra",new Etatpandemie("faible"));
			else
				if(ville.equals("Salé"))
					return new Region("Rabat-Salé-Kenitra",new Etatpandemie("faible"));
				else
					if(ville.equals("Merrakech"))
						return new Region("Marrakech-Safi",new Etatpandemie("haut"));
					else
						if(ville.equals("Meknass"))
							return new Region("Marrakech-Safi",new Etatpandemie("haut"));
						else
							if(ville.equals("Tanger"))
								return new Region("Tétouan-AlHoceïma",new Etatpandemie("haut"));
		return null;
	}
	
	
	
	
	/**
	 * Create the frame.
	 */
	public InterfaceEssaie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 306, 579);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setBounds(44, 230, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setBounds(44, 269, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ville");
		lblNewLabel_2.setBounds(44, 362, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("age");
		lblNewLabel_3.setBounds(44, 312, 46, 14);
		panel.add(lblNewLabel_3);
		
		textNom = new JTextField();
		textNom.setBounds(128, 227, 122, 20);
		panel.add(textNom);
		textNom.setColumns(10);
		
		textPrenom = new JTextField();
		textPrenom.setColumns(10);
		textPrenom.setBounds(128, 266, 122, 20);
		panel.add(textPrenom);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(128, 309, 122, 20);
		panel.add(textAge);
		
		comboBox = new JComboBox(listevilles);
		comboBox.setBounds(128, 358, 122, 22);
		panel.add(comboBox);
		
		JButton Btn_allerDiag = new JButton("Aller au diagnostic");
		Btn_allerDiag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Client cl = new Client();
				cl.setAge(Integer.parseInt(textAge.getText().toString()));
				cl.setNom(textNom.getText());
				
				cl.setVille(new Ville(comboBox.getSelectedItem().toString(),get_region()));

				diagnostic = new Diagnostic(cl);
				cl.ajouter_diagnostic(diagnostic);
				
				panel_1.setVisible(true);
			}
		});
		Btn_allerDiag.setBounds(60, 423, 168, 30);
		panel.add(Btn_allerDiag);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Vos Informations Personnelles");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNewLabel_4_1_2.setBounds(25, 56, 244, 44);
		panel.add(lblNewLabel_4_1_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(216, 191, 216));
		separator_2.setBounds(44, 90, 216, 8);
		panel.add(separator_2);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(216, 191, 216));
		panel_1.setBounds(304, 0, 635, 579);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 95, 226, 304);
		panel_1.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(model);
		SetListSymptome();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(381, 95, 226, 304);
		panel_1.add(scrollPane_1);
		
		list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		list_1.setModel(model1);
		
		
		JButton btnAjouter = new JButton("Ajouter");
		
		btnAjouter.setBounds(267, 124, 104, 23);
		panel_1.add(btnAjouter);
		
		JButton btnAjouter_tous = new JButton("Ajouter tous");
		btnAjouter_tous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
						boolean bool=true;
						while(model.size()>0) {
							Symptome s = new Symptome(model.getElementAt(0));
							if( model.getElementAt(0).equals("fievre"))
							{
								bool=true;
								if(textTempérature.getText().toString().equals(""))
								{
									JOptionPane.showMessageDialog(null,"Attention ! \nil faut saisir votre température !!");
									bool = false;
									break;
								}else
								{
									System.out.println("fievre");
									s.setMesure(new Temperature(Integer.parseInt(textTempérature.getText().toString())));
									bool=true;
								}
							}
							if(bool) {
								System.out.println("really?");
								model1.addElement(model.getElementAt(0));
								
								model.remove(0);
								symptomes_client.add(s);
								SetListSymptome_client();
								diagnostic.setSymptomes(symptomes_client);
								
								btnSupprimer_tous.setEnabled(true);
								btnAjouter_tous.setEnabled(false);
							}
						}
						DroolsTest drl = new DroolsTest();
						drl.Traitement(diagnostic);
						
						lbl_degre.setText(String.valueOf(diagnostic.getDegreCont_C19()));
			}
		});
		btnAjouter_tous.setBounds(267, 158, 104, 23);
		panel_1.add(btnAjouter_tous);
		
		btnSupprimer = new JButton("Supprimer");
		
		btnSupprimer.setBounds(267, 319, 104, 23);
		panel_1.add(btnSupprimer);
		
		btnSupprimer_tous = new JButton("Supprimer tous");
		
		btnSupprimer_tous.setBounds(260, 353, 116, 23);
		panel_1.add(btnSupprimer_tous);
		
		JLabel lblNewLabel_4 = new JLabel("le degr\u00E9 de contamination :");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_4.setBounds(142, 545, 244, 23);
		panel_1.add(lblNewLabel_4);
		
		lbl_degre = new JLabel("");
		lbl_degre.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lbl_degre.setBounds(410, 545, 111, 23);
		panel_1.add(lbl_degre);
		
		JLabel lblNewLabel_3_1 = new JLabel("Temp\u00E9rature :");
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(29, 27, 96, 23);
		panel_1.add(lblNewLabel_3_1);
		
		textTempérature = new JTextField();
		textTempérature.setColumns(10);
		textTempérature.setBounds(137, 29, 122, 20);
		panel_1.add(textTempérature);
		
		check_Cardiaque = new JCheckBox("Cardiaque");
		
		
		check_Cardiaque.addActionListener(this);
		check_Cardiaque.setBounds(129, 442, 97, 23);
		panel_1.add(check_Cardiaque);
		
		check_Diabéte = new JCheckBox("Diab\u00E9te");
		check_Diabéte.addActionListener(this);
		check_Diabéte.setBounds(278, 442, 97, 23);
		panel_1.add(check_Diabéte);

		check_HyperTendu = new JCheckBox("HyperTendu");
		check_HyperTendu.addActionListener(this);
		check_HyperTendu.setBounds(424, 442, 97, 23);
		panel_1.add(check_HyperTendu);
		
		JLabel lblNewLabel_4_1 = new JLabel("Avez -Vous une maladie chronique :");
		lblNewLabel_4_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(31, 412, 244, 23);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Avez-vous un contact avec Covid19 :");
		lblNewLabel_4_1_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_4_1_1.setBounds(31, 472, 244, 23);
		panel_1.add(lblNewLabel_4_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.WHITE);
		separator.setBounds(249, 422, 351, 4);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(256, 486, 351, 4);
		panel_1.add(separator_1);
		
		check_contactC19 = new JCheckBox("j'avais un contact covid19");
		check_contactC19.addActionListener(this);
		check_contactC19.setBounds(137, 502, 164, 23);
		panel_1.add(check_contactC19);
		panel_1.setVisible(false);
		
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ind = list.getSelectedIndex();
				
				if(ind>=0)
				{
					Boolean bool=true;
					Symptome s = new Symptome(model.getElementAt(ind));
					if( list.getSelectedValue().equals("fievre"))
					{
						if(textTempérature.getText().toString().equals(""))
						{
							JOptionPane.showMessageDialog(null,"Attention ! \nil faut saisir votre température !!");
							bool = false;
						}else
						{
							System.out.println("fievre");
							s.setMesure(new Temperature(Integer.parseInt(textTempérature.getText().toString())));
						}		
					}
					if(bool)
					{
						symptomes_client.add(s);
						SetListSymptome_client();
						
						model.removeElement(model.getElementAt(ind));
						
						diagnostic.setSymptomes(symptomes_client);
						
						DroolsTest drl = new DroolsTest();
						drl.Traitement(diagnostic);
				
						lbl_degre.setText(String.valueOf(diagnostic.getDegreCont_C19()));	
					}
				}else 
				{
					JOptionPane.showMessageDialog( contentPane, "please select a row");
				}
				
				btnSupprimer_tous.setEnabled(true);
			}
		});
		
		
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ind = list_1.getSelectedIndex();
				if(ind>=0)
				{
					symptomes_client.remove(ind);
					
					model.addElement(model1.getElementAt(ind));
					
					SetListSymptome_client();
					
					for(Symptome s:symptomes_client)System.out.println(s.getDescription());
									
					diagnostic.setSymptomes(symptomes_client);
					diagnostic.setDegreCont_C19(0.0);
					DroolsTest drl = new DroolsTest();
					drl.Traitement(diagnostic);
					
					lbl_degre.setText(String.valueOf(diagnostic.getDegreCont_C19()));	
				}
				else
				{
					JOptionPane.showMessageDialog( contentPane, "please select a row");
				}
				btnAjouter_tous.setEnabled(true);
				
			}
		});
		
		btnSupprimer_tous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				while(model1.size()>0) {
					model.addElement(model1.getElementAt(0));
					model1.remove(0);
				}
				symptomes_client.clear();
				for(Symptome s:symptomes_client) {
					System.out.println(s.getDescription());
				}
				diagnostic.setSymptomes(symptomes_client);
				diagnostic.setDegreCont_C19(0.0);
				DroolsTest drl = new DroolsTest();
				drl.Traitement(diagnostic);
				lbl_degre.setText(String.valueOf(diagnostic.getDegreCont_C19()));
				
				btnSupprimer_tous.setEnabled(false);
				btnAjouter_tous.setEnabled(true);
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==check_Cardiaque || e.getSource()==check_Diabéte || e.getSource()==check_HyperTendu)
		{
			Collection<Maladie> maladie_chronique = new ArrayList<Maladie>();
			
			if(check_Cardiaque.isSelected())
				maladie_chronique.add(new Cardiaque());
			if(check_Diabéte.isSelected())
				maladie_chronique.add(new Diabete());
			if(check_HyperTendu.isSelected())
				maladie_chronique.add(new HyperTension());
			
			diagnostic.setMaladiesSympt(maladie_chronique);
		}
		else
			if(e.getSource()==check_contactC19)
			{
				if(check_contactC19.isSelected())
					diagnostic.setContact_Covid19(true);
				else
					diagnostic.setContact_Covid19(false);
			}
		
		diagnostic.setDegreCont_C19(0.0);
		DroolsTest drl = new DroolsTest();
		drl.Traitement(diagnostic);
		
		lbl_degre.setText(String.valueOf(diagnostic.getDegreCont_C19()));
		
	}
}
