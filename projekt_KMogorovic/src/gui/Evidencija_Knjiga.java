package gui;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Font;






import javax.swing.table.TableRowSorter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Evidencija_Knjiga {

	private JFrame frame;
	private JTextField autor;
	private JTextField nazivKnjige;
	private JTextField godinaPublikacije;
	private JComboBox zanr;           ////////////
	private JTable tablica;
	private JScrollPane scrollPane;
	private JButton azurirajTablicu;
	private JButton brisanjeRetka;
	private JButton azuriranjeRetka;
	private JLabel LabelISBN;
	private JTextField isbn;
	private JLabel LabelBrPrimj;
	private JTextField brPrimjeraka;
	private JLabel LabelIzdavac;
	private JTextField izdavac;
	private JLabel LabelNaslov;
	private JTextField trazilica;
	private JLabel logo1;
	private JLabel background1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evidencija_Knjiga window = new Evidencija_Knjiga();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Evidencija_Knjiga() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(239, 235, 248));
		frame.setBounds(100, 100, 1116, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		LabelNaslov = new JLabel("EVIDENCIJA KNJIGA");
		LabelNaslov.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 42));
		LabelNaslov.setBounds(323, 38, 456, 66);
		frame.getContentPane().add(LabelNaslov);
		
		JLabel LabelAutor = new JLabel("Autor:");
		LabelAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelAutor.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelAutor.setBounds(10, 146, 151, 14);
		frame.getContentPane().add(LabelAutor);
		
		JLabel LabelNaziv = new JLabel("Naziv knjige:");
		LabelNaziv.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelNaziv.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelNaziv.setBounds(10, 170, 151, 14);
		frame.getContentPane().add(LabelNaziv);
		
		JLabel LabelGodPubl = new JLabel("Godina prve publikacije:");
		LabelGodPubl.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelGodPubl.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelGodPubl.setBounds(10, 194, 151, 14);
		frame.getContentPane().add(LabelGodPubl);
		
		autor = new JTextField();
		autor.setBounds(193, 144, 283, 20);
		frame.getContentPane().add(autor);
		autor.setColumns(10);
		
		nazivKnjige = new JTextField();
		nazivKnjige.setBounds(194, 168, 282, 20);
		frame.getContentPane().add(nazivKnjige);
		nazivKnjige.setColumns(10);
		
		godinaPublikacije = new JTextField();
		godinaPublikacije.setBounds(194, 192, 86, 20);
		frame.getContentPane().add(godinaPublikacije);
		godinaPublikacije.setColumns(10);

		JLabel LabelZanr = new JLabel("Žanr:");
		LabelZanr.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelZanr.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelZanr.setBounds(10, 222, 151, 13);
		frame.getContentPane().add(LabelZanr);
		
		JComboBox zanr = new JComboBox();
		zanr.setBackground(new Color(227, 241, 255));
		zanr.setModel(new DefaultComboBoxModel(new String[] {"", "Autobiografija", "Biografija", "Drama", "Fantazija", "Fikcija", "Non-fiction", "Horor", "Klasik", "Komedija", "Misterij", "Mitologija", "Poezija", "Romansa", "Samopomoć", "Sc-Fi", "Triler", "YA (Yung Adult)", "Ostalo"}));
		zanr.setBounds(193, 218, 146, 21);
		frame.getContentPane().add(zanr);

		LabelISBN = new JLabel("ISBN: ");
		LabelISBN.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelISBN.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelISBN.setBounds(10, 245, 151, 13);
		frame.getContentPane().add(LabelISBN);
		
		isbn = new JTextField();
		isbn.setBounds(193, 242, 190, 19);
		frame.getContentPane().add(isbn);
		isbn.setColumns(10);

		LabelBrPrimj = new JLabel("Broj primjeraka: ");
		LabelBrPrimj.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelBrPrimj.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelBrPrimj.setBounds(10, 268, 151, 13);
		frame.getContentPane().add(LabelBrPrimj);
		
		brPrimjeraka = new JTextField();
		brPrimjeraka.setBounds(193, 265, 96, 19);
		frame.getContentPane().add(brPrimjeraka);
		brPrimjeraka.setColumns(10);

		LabelIzdavac = new JLabel("Izdavač:");
		LabelIzdavac.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelIzdavac.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelIzdavac.setBounds(65, 291, 96, 13);
		frame.getContentPane().add(LabelIzdavac);
		
		izdavac = new JTextField();
		izdavac.setBounds(193, 288, 190, 19);
		frame.getContentPane().add(izdavac);
		izdavac.setColumns(10);
		
////////////////////////////////////////////// Stupci u tablici
		Object[] prviRedak = {"AUTOR", "NAZIV", "PRVA PUBLIKACIJA(god.)", "ŽANR", "ISBN", "Br.Primjeraka", "IZDAVAČ"};  
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 326, 1082, 328);
		frame.getContentPane().add(scrollPane);
		
		tablica = new JTable(new DefaultTableModel(null, prviRedak));
		tablica.setBackground(new Color(242, 247, 251));
		scrollPane.setViewportView(tablica);
		
		

		
////////////////////////////////////		prikaz svih podataka odmah pri pokretanju
		String naziv="C:\\Users\\Korisnik\\eclipse-workspace\\projekt_KMogorovic\\knjiznica.txt";  //datoteka iz koje se čita
		//String naziv="knjiznica.txt";  //drugi nacin za citanje iz datoteke 
		try (BufferedReader reader = new BufferedReader(new FileReader(naziv)))	{
			String redak;
			while ((redak=reader.readLine()) !=null) { 								// sve dok ne dođe do zadnjeg reda (praznog)
				String[] podaci = redak.split("~"); 								//rastavi podatke u redu po separatoru ~
				((DefaultTableModel)tablica.getModel()).addRow(podaci); 			//stavljanje reka u talicu
			} //while petlja

		} // try blok
		catch (IOException e2){
			//JOptionPane.showMessageDialog(null, "Došlo je do greške s dohvatom podataka. \nPokušajte ponovo.");
			JOptionPane.showMessageDialog(null, "Tekstualna datoteka ne postoji. \nIzraditi će se nova, no biti će prazna.");
		}
		
		

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  SPREMANJE PODATAKA
		JButton spremanje = new JButton("SPREMI");
		spremanje.setBackground(new Color(199, 214, 235));
		spremanje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String autors, nazivs, godinas, zanrs, isbns, brPrimjerakas, izdavacs;
				
				autors=autor.getText();
				nazivs=nazivKnjige.getText();
				godinas=godinaPublikacije.getText();
				zanrs = (String)zanr.getSelectedItem();
				isbns=isbn.getText();
				brPrimjerakas=brPrimjeraka.getText();
				izdavacs=izdavac.getText();
				
				
				String unos=autors+"~"+nazivs+"~"+godinas+"~"+zanrs+"~"+isbns+"~"+brPrimjerakas+"~"+izdavacs;     //oblik koj ce se upisat u datoteku, upis je dole; ~ =>separator
				
				String naziv="C:\\Users\\Korisnik\\eclipse-workspace\\projekt_KMogorovic\\knjiznica.txt";
				
				
				
				if (autors.equals("") || nazivs.equals("") || godinas.equals("") || zanrs.equals("") || isbns.equals("") || brPrimjerakas.equals("") || izdavacs.equals("")) {
					JOptionPane.showMessageDialog(null, "Morate upisati sve podatke!");
				}//if blok
				
				else
				{
					
					try	{
						Integer.parseInt(godinas);			//pokušaj parsiranja stringa u broj --> ako ne uspije ide u catch blok
						Integer.parseInt(brPrimjerakas);
						
						FileWriter datoteka=new FileWriter(naziv, true);
						datoteka.write(unos);    					//u datoteku se sprema gore definiran oblik unosa
						datoteka.write("\n");    					//novi red
						datoteka.close();        					//zatvaranje datoteke
						JOptionPane.showMessageDialog(null, "Podaci su upiješno spremljeni");  //poruka korisniku
						
						autor.setText("");           				//postavljanje polja da budu prazna
						nazivKnjige.setText("");
						godinaPublikacije.setText("");
						zanr.setSelectedItem(null);   				// postavljanje combo boxa na null - da bude prazan
						isbn.setText("");
						brPrimjeraka.setText("");
						izdavac.setText("");
				 
						String podaci[]= {autors, nazivs, godinas, zanrs, isbns, brPrimjerakas, izdavacs};   // stavljanje podataka u tablicu
						DefaultTableModel tablicas = (DefaultTableModel)tablica.getModel();
						tablicas.addRow(podaci);

					}//try blok
					
					catch(IOException greska) { //input output
						JOptionPane.showMessageDialog(null, "Došlo je do greške. \nPokušajte ponovo.");
					} //catch blok
					
					catch(NumberFormatException greskaBrojevi ){ 				//ako nemože parsirat string u broj
						JOptionPane.showMessageDialog(null, "Pod stavke 'Godina' i 'Broj primjeraka' morate upisati samo broj!");
					}//catch blok
					
					
				}//else blok naredbi

				
			}//public void actionPerformed
		}); //spremanje.addActionListener(new ActionListener
		
		spremanje.setBounds(447, 268, 112, 41);
		frame.getContentPane().add(spremanje);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  DOHVAĆANJE PODATAKA
		azurirajTablicu = new JButton("AŽURIRAJ TABLICU");
		azurirajTablicu.setBackground(new Color(199, 214, 235));
		azurirajTablicu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				String naziv="C:\\Users\\Korisnik\\eclipse-workspace\\projekt_KMogorovic\\knjiznica.txt";  //datoteka iz koje se čita
				try (BufferedReader reader = new BufferedReader(new FileReader(naziv)))	{
					
					// BRISANJE SVIH PODATAKA IZ TABLICE
					DefaultTableModel model = (DefaultTableModel) tablica.getModel();
					model.setRowCount(0); 						//postavljanje broja redaka na 0 --> uklanjanje svih retka iz tablice
					
					//DOHVAĆANJE PODATAKA IZ DATOTEKE I STAVLJANJE U TABLICU
					String redak;
					while ((redak=reader.readLine()) !=null) { 					// sve dok ne dođe do zadnjeg reda (praznog)
						String[] podaci = redak.split("~"); 					//rastavi podatke u redu po separatoru ~
						((DefaultTableModel)tablica.getModel()).addRow(podaci); //stavljanje reka u talicu
					} //while petlja
	
				} // try blok
				
				catch (Exception greskaDohvat){
					JOptionPane.showMessageDialog(null, "Došlo je do greške s dohvatom podataka. \nPokušajte ponovo.");
				}//catch blok
				
			} //public void actionPerformed
		}); //dohvaćanjePodatka.addActionListener(new ActionListener
		
		azurirajTablicu.setBounds(734, 268, 184, 44);
		frame.getContentPane().add(azurirajTablicu);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  BRISANJE RETKA(u tablici)-datoteka??
		brisanjeRetka = new JButton("OBRI\u0160I REDAK");
		brisanjeRetka.setBackground(new Color(199, 214, 235));
		brisanjeRetka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				int izabraniRedak = tablica.getSelectedRow();
				if (izabraniRedak!= -1) {    //razlicito od -1 
					((DefaultTableModel)tablica.getModel()).removeRow(izabraniRedak);
				} // if blok
			}
			catch(Exception greskaBrisanje) {
				JOptionPane.showMessageDialog(null, "Došlo je do greške s brisanjem podataka iz talice. \nPokušajte ponovo.");
			}

			}//public void actionPerformed
		});//brisanjeRetka.addActionListener(new ActionListener
		brisanjeRetka.setBounds(421, 660, 177, 30);
		frame.getContentPane().add(brisanjeRetka);
		
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////// AŽURIRANJE RETKA (u tablici)-datoteka??
		azuriranjeRetka = new JButton("A\u017DURIRAJ REDAK");
		azuriranjeRetka.setBackground(new Color(199, 214, 235));
		azuriranjeRetka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {				
				String autorUpdate, nazivUpdate, godinaUpdate, zanrUpdate, isbnUpdate, brUpdate, izdavacUpdate;

				
				autorUpdate=autor.getText();
				nazivUpdate=nazivKnjige.getText();
				godinaUpdate=godinaPublikacije.getText();
				zanrUpdate = (String)zanr.getSelectedItem();//
				isbnUpdate=isbn.getText();//
				brUpdate=brPrimjeraka.getText();//
				izdavacUpdate=izdavac.getText();
				
				/*
				//nisan stavila provjeru
				if (autorUpdate.equals("") || nazivUpdate.equals("") || godinaUpdate.equals("") || zanrUpdate.equals("") || isbnUpdate.equals("") || brUpdate.equals("") || izdavacUpdate.equals("")) {
					JOptionPane.showMessageDialog(null, "Morate upisati sve podatke!");
				}//if blok
				
				Integer.parseInt(godinaUpdate);
				Integer.parseInt(brUpdate);
				*/
				
				
				int izabraniRedak = tablica.getSelectedRow();
				
				((DefaultTableModel)tablica.getModel()).setValueAt(autorUpdate, izabraniRedak, 0);	//varijable od gore se stavljaju u tablicu --> brojevi su indeksi stupca
				((DefaultTableModel)tablica.getModel()).setValueAt(nazivUpdate, izabraniRedak, 1);
				((DefaultTableModel)tablica.getModel()).setValueAt(godinaUpdate, izabraniRedak, 2);
				((DefaultTableModel)tablica.getModel()).setValueAt(zanrUpdate, izabraniRedak, 3);	//
				((DefaultTableModel)tablica.getModel()).setValueAt(isbnUpdate, izabraniRedak, 4);//
				((DefaultTableModel)tablica.getModel()).setValueAt(brUpdate, izabraniRedak, 5);//
				((DefaultTableModel)tablica.getModel()).setValueAt(izdavacUpdate, izabraniRedak, 6);//
				
			}
			catch(NumberFormatException greska_broj) {
				JOptionPane.showMessageDialog(null, "upisite brojeve u polja godina i broj primjeraka!");
			}
			catch(Exception greskaAzuriraj) {
				JOptionPane.showMessageDialog(null, "Došlo je do greške s ažuriranjem retka. \nPokušajte ponovo.");
			}
			
			}//public void actionPerformed
		});//azuriranjeRetka.addActionListener(new ActionListener
		

		azuriranjeRetka.setBounds(630, 660, 146, 30);
		frame.getContentPane().add(azuriranjeRetka);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	TRAZILICA
		trazilica = new JTextField();
		
		trazilica.addActionListener(new ActionListener() {
		    
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel model=(DefaultTableModel)tablica.getModel();
					TableRowSorter <DefaultTableModel> tr= new TableRowSorter<>(model);
					tablica.setRowSorter(tr);
					tr.setRowFilter(RowFilter.regexFilter(trazilica.getText().trim()));
					
					// ako je tablica prazna javlja se ekran da korisnik provjeri velika slova
					int red=tablica.getRowCount();
					if(red==0) 
						JOptionPane.showMessageDialog(null, "Nema takvih knjiga \nProvjerite jeste li dobro upisali riječi ili velika slova.");
					
				}//try
				catch (Exception greskaTrazilica) {
					JOptionPane.showMessageDialog(null, "Došlo je do greške. \nPokušajte ponovo.");
				}//catch
			}//public void
		});//action listener
		
		trazilica.setBounds(734, 168, 96, 19);
		frame.getContentPane().add(trazilica);
		trazilica.setColumns(10);
		
		JLabel LabelTrazi = new JLabel("Traži: ");
		LabelTrazi.setFont(new Font("Tahoma", Font.BOLD, 12));
		LabelTrazi.setBounds(682, 171, 42, 13);
		frame.getContentPane().add(LabelTrazi);
		


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  SELEKTIRANJE RETKA
		tablica.getSelectionModel().addListSelectionListener(e -> {
			int izabraniRedak = tablica.getSelectedRow();
			try {
				if (izabraniRedak!=-1)
				{
					String podatak1=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 0).toString();
					String podatak2=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 1).toString();
					String podatak3=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 2).toString();
					String podatak4=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 3).toString();
					String podatak5=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 4).toString();
					String podatak6=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 5).toString();
					String podatak7=((DefaultTableModel)tablica.getModel()).getValueAt(izabraniRedak, 6).toString();
				
					autor.setText(podatak1);
					nazivKnjige.setText(podatak2);
					godinaPublikacije.setText(podatak3);
					zanr.setSelectedItem(podatak4);
					isbn.setText(podatak5);
					brPrimjeraka.setText(podatak6);
					izdavac.setText(podatak7);
				}//if
			}//try
			catch (Exception e22){
				JOptionPane.showMessageDialog(null, "Došlo je do greške kod dabira retka. \nPokušajte ponovo.");
			}//catch
			
            
           });//tablica.getSelectionModel().addListSelectionListen
		
		
		

		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////pozadina i logo
//ovaj dio funkcionira samo ako je put do slike kao i dolje navedeno
//kada san napravila jLabel, u 'properties' pod "icon" san odabrala -absolute path in file system

JLabel logo;
logo1 = new JLabel("");
logo1.setVerticalAlignment(SwingConstants.TOP);
logo1.setIcon(new ImageIcon("C:\\Users\\Korisnik\\eclipse-workspace\\projekt_KMogorovic\\logo1.png"));
logo1.setBounds(109, 22, 100, 100);
frame.getContentPane().add(logo1);

JLabel background;
background1 = new JLabel("");
background1.setVerticalAlignment(SwingConstants.BOTTOM);
background1.setIcon(new ImageIcon("C:\\Users\\Korisnik\\eclipse-workspace\\projekt_KMogorovic\\background.png"));
background1.setBounds(0, 0, 1102, 695);
frame.getContentPane().add(background1);



		

         
	
	
	
	} //private void initialize()
} //public class Evidencija_Knjiga 


