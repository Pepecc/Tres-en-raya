import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;




	public class Tres_en_raya extends JFrame implements ActionListener{
		
			private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
			private JButton inicio,salir;
			private JLabel turno, j1,j2;		
			int jugador;
			public boolean turn=true;
			int pulsaciones=0;
			
			ImageIcon win= new ImageIcon("wini.png");
			ImageIcon lin= new ImageIcon("lini.png");
	
		
			public Tres_en_raya(){				
				
				setLayout(null);
				
				turno= new JLabel("Turno");
				turno.setBounds(120,330,100,50);
				turno.setFont(new Font("Arial", Font.BOLD,30));
				turno.setForeground(Color.blue);
				add(turno);
				
				j1= new JLabel("Jugador 1");
				j1.setBounds(20,370,100,50);
				j1.setFont(new Font("Arial", Font.BOLD,20));
				j1.setForeground(Color.red);
				add(j1);
				
				j2= new JLabel("Jugador 2");
				j2.setBounds(200,370,100,50);
				j2.setFont(new Font("Arial", Font.BOLD,20));
				j2.setForeground(Color.red);
				add(j2);				
			
				
				b1= new JButton();									
				b1.setBounds(10,20,100,100);								
				add(b1);				
				b1.addActionListener(this);
				
				
				b2= new JButton();							
				b2.setBounds(110,20,100,100);
				add(b2);
				b2.addActionListener(this);
				
				b3= new JButton();
				b3.setBounds(210,20,100,100);
				add(b3);
				b3.addActionListener(this);
				
				b4= new JButton();
				b4.setBounds(10,120,100,100);
				add(b4);
				b4.addActionListener(this);
				
				b5= new JButton();
				b5.setBounds(110,120,100,100);
				add(b5);
				b5.addActionListener(this);
				
				b6= new JButton();
				b6.setBounds(210,120,100,100);
				add(b6);
				b6.addActionListener(this);
				
				b7= new JButton();
				b7.setBounds(10,220,100,100);
				add(b7);
				b7.addActionListener(this);
				
				b8= new JButton();
				b8.setBounds(110,220,100,100);
				add(b8);
				b8.addActionListener(this);
				
				b9= new JButton();
				b9.setBounds(210,220,100,100);
				add(b9);
				b9.addActionListener(this);
				
				inicio= new JButton("Nuevo juego");
				inicio.setBounds(10,470,110,30);
				add(inicio);
				inicio.addActionListener(this);
				
				salir=new JButton("Salir");
				salir.setBounds(195,470,110,30);
				add(salir);
				salir.addActionListener(this);				
			
		}
	
			

	public void Comprobar(){
				
        if  (b1.getIcon()==lin && b2.getIcon()==lin && b3.getIcon()==lin ||			
             b1.getIcon()==lin && b4.getIcon()==lin && b7.getIcon()==lin ||                   
             b7.getIcon()==lin && b8.getIcon()==lin && b9.getIcon()==lin ||                         
			 b3.getIcon()==lin && b6.getIcon()==lin && b9.getIcon()==lin ||            
			 b2.getIcon()==lin && b5.getIcon()==lin && b8.getIcon()==lin ||            
             b4.getIcon()==lin && b5.getIcon()==lin && b6.getIcon()==lin ||            
             b1.getIcon()==lin && b5.getIcon()==lin && b9.getIcon()==lin ||            
             b3.getIcon()==lin && b5.getIcon()==lin && b7.getIcon()==lin)
			{				
				Finjuego(1);
			}			
			
        if  (b1.getIcon()==win && b2.getIcon()==win && b3.getIcon()==win ||
             b1.getIcon()==win && b4.getIcon()==win && b7.getIcon()==win ||
             b7.getIcon()==win && b8.getIcon()==win && b9.getIcon()==win ||
             b3.getIcon()==win && b6.getIcon()==win && b9.getIcon()==win ||
             b2.getIcon()==win && b5.getIcon()==win && b8.getIcon()==win ||
             b4.getIcon()==win && b5.getIcon()==win && b6.getIcon()==win ||
             b1.getIcon()==win && b5.getIcon()==win && b9.getIcon()==win ||
             b3.getIcon()==win && b5.getIcon()==win && b7.getIcon()==win)
			{				
				Finjuego(2);
			}			
		}
		
			
			public void Finjuego(int jugador){
				if(jugador==0){
					JOptionPane.showMessageDialog(null,"Empate, no hay ganador");
					}
				else if(jugador==1){
			 		JOptionPane.showMessageDialog(null,"Tux gana");			
						}						
				else if(jugador==2){
					JOptionPane.showMessageDialog(null,"Windows gana");					
						}				
				Inicializar();
					}
					
			public void Inicializar(){
				pulsaciones=0;
				turn=true;
				jugador=1;				
				j1.setForeground(Color.green);
				j2.setForeground(Color.red);
				b1.setIcon(null);
				b2.setIcon(null);
				b3.setIcon(null);
				b4.setIcon(null);
				b5.setIcon(null);
				b6.setIcon(null);
				b7.setIcon(null);
				b8.setIcon(null);
				b9.setIcon(null);
			}
		
			
			
			public void Cambiocolor(int jugador){				
				
				if(jugador==1){
					j2.setForeground(Color.red);
					j1.setForeground(Color.green);
					
					}
				if(jugador==2){
					j1.setForeground(Color.red);
					j2.setForeground(Color.green);
					}
				}
				
				
			 public void botonPulsadoInsertarIcono(JButton boton){
					if(pulsaciones==9){						
						Finjuego(0);
						}
					
					else if (pulsaciones<9){
						if(boton.getIcon()==null){
							if(turn==true){
							boton.setIcon(lin);						                
							Comprobar();       
							turn=false;           
								}
						else if(turn==false){
						   boton.setIcon(win);						                 
						   Comprobar();       
						   turn=true;         
								}
							}
					
						}    
				}
			public void actionPerformed(ActionEvent e){				
				
				if(e.getSource()==inicio){
					Inicializar();				
					}				
				if(e.getSource()==salir){
					System.exit(0);
					}					
				if(e.getSource()==b1 && b1.getIcon()==null){
					botonPulsadoInsertarIcono(b1);
					pulsaciones=pulsaciones+1;
					}					
				if(e.getSource()==b2 && b2.getIcon()==null){				
					botonPulsadoInsertarIcono(b2);	
					pulsaciones=pulsaciones+1;		
					}
				if(e.getSource()==b3 && b3.getIcon()==null){					
					botonPulsadoInsertarIcono(b3);	pulsaciones=pulsaciones+1;		
					}
				if(e.getSource()==b4 && b4.getIcon()==null){					
					botonPulsadoInsertarIcono(b4);	pulsaciones=pulsaciones+1;							
					}
				if(e.getSource()==b5 && b5.getIcon()==null){				
					botonPulsadoInsertarIcono(b5);		pulsaciones=pulsaciones+1;	
					}
				if(e.getSource()==b6 && b6.getIcon()==null){				
					botonPulsadoInsertarIcono(b6);		pulsaciones=pulsaciones+1;	
					}
				if(e.getSource()==b7 && b7.getIcon()==null){					
					botonPulsadoInsertarIcono(b7);	pulsaciones=pulsaciones+1;		
					}
				if(e.getSource()==b8 && b8.getIcon()==null){					
					botonPulsadoInsertarIcono(b8);		pulsaciones=pulsaciones+1;	
					}
				if(e.getSource()==b9 && b9.getIcon()==null){				
					botonPulsadoInsertarIcono(b9);	pulsaciones=pulsaciones+1;		
					}
					
				}	
	
				
				
			public static void main(String ar[]){
				
				Tres_en_raya juego= new Tres_en_raya();
				juego.setBounds(800,350,325,550);
				juego.setVisible(true);
				juego.setResizable(false);
				juego.setTitle("TresEnRaya 1.0v");
				
				
				}
		
		}
