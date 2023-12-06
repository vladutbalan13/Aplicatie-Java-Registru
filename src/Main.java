import java.awt.event.*;
import java.util.Scanner;
import java.awt.*;
import static javax.swing.SwingConstants.CENTER;

public class Main {

    static Registru reg=new Registru();
    public static void main(String[] args) {
        Frame test=new Frame();
        Frame Aplicatie=new Frame();
        Frame page_4=new Frame();
        Aplicatie.setVisible(true);
        Aplicatie.setSize(800,600);
        Aplicatie.setLayout(new GridLayout(5,1));
        Button buton1= new Button("1. Adauga angajat in lista.");
        Button buton2= new Button("2.Afiseaza lista");
        Button buton3= new Button("3.Exit");
        Button buton4= new Button("4.Sterge Angajat");
        Button buton5= new Button("5. Modifica un angajat in lista.");
        Button menu=new Button("Inapoi la pagina principala");
        Aplicatie.add(buton1);
        Aplicatie.add(buton2);
        Aplicatie.add(buton3);
        Aplicatie.add(buton4);
        Aplicatie.add(buton5);
        Aplicatie.addWindowListener(new exitFrame());
        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Angajat employee= new Angajat();
                Aplicatie.removeAll();
                Label name= new Label("Introduceti numele");
                Label age= new Label("Introduceti varsta");
                Label job_= new Label("Introduceti job-ul");
                TextField nume= new TextField("Scrieti numele..");
                nume.setBounds(50,100,200,30);
                TextField varsta= new TextField("Scrieti varsta..");
                TextField job= new TextField("Scrieti jobul..");
                name.setBounds(50,50,200,30);
                age.setBounds(50,50,200,30);
                job.setBounds(50,50,200,30);
                Aplicatie.add(name);
                Aplicatie.add(nume);
                Aplicatie.add(age);
                Aplicatie.add(varsta);
                Aplicatie.add(job_);
                Aplicatie.add(job);
                Aplicatie.revalidate();
                Aplicatie.repaint();
                nume.addMouseListener (new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e);
                        nume.setText(null);

                    }
                });
                nume.addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        super.focusGained(e);
                        nume.setText(null);
                    }
                });
                nume.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        super.keyPressed(e);
                        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                            employee.nume= nume.getText();
                            varsta.requestFocusInWindow();
                        }
                    }
                });
                varsta.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e);
                        varsta.setText(null);
                    }
                });
                varsta.addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        super.focusGained(e);
                        varsta.setText(null);
                    }
                });
                varsta.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        super.keyPressed(e);
                        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                        {
                            employee.varsta=Integer.parseInt(varsta.getText());


                            job.requestFocusInWindow();
                        }
                    }
                });
                job.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        super.mousePressed(e);
                        job.setText(null);
                    }
                });
                job.addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        super.focusGained(e);
                        job.setText(null);
                    }
                });
                job.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        super.keyPressed(e);
                        if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                            employee.locdemunca=job.getText();
                            Label finish = new Label("Persoana adaugata!",CENTER);
                            finish.setForeground(Color.green);
                            Aplicatie.add(finish);
                            finish.setFont(new Font("TimesRoman",Font.PLAIN,30));
                            finish.setAlignment(Label.CENTER);
                            Aplicatie.add(menu);
                            Aplicatie.revalidate();
                            Aplicatie.repaint();
                            menu.setSize(200,100);
                            menu.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    super.mouseClicked(e);
                                    Aplicatie.removeAll();
                                    Aplicatie.add(buton1);
                                    Aplicatie.add(buton2);
                                    Aplicatie.add(buton3);
                                    Aplicatie.add(buton4);
                                    Aplicatie.add(buton5);
                                    Aplicatie.revalidate();
                                    Aplicatie.repaint();
                                }
                            });
                        }
                        reg.add_angajat(employee);
                    }
                });

            }
        });
        buton2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label l=new Label(reg.toString());
                System.out.println(reg.toString());
                l.setFont(new Font("TimesRoman",Font.PLAIN,20));
                Aplicatie.removeAll();
                Aplicatie.setLayout(new FlowLayout());
                Aplicatie.add(l);
                Aplicatie.add(menu,BorderLayout .PAGE_END);
                Aplicatie.revalidate();
                Aplicatie.repaint();
                menu.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        Aplicatie.setLayout(new GridLayout(5,1));
                        Aplicatie.removeAll();
                        Aplicatie.add(buton1);
                        Aplicatie.add(buton2);
                        Aplicatie.add(buton3);
                        Aplicatie.add(buton4);
                        Aplicatie.add(buton5);
                        Aplicatie.revalidate();
                        Aplicatie.repaint();
                    }
                });



            }
        }));
        buton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buton4.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                    Angajat employee_del = new Angajat();
                    Aplicatie.removeAll();
                    Label name = new Label("Introduceti numele");
                    Label age = new Label("Introduceti varsta");
                    Label job_ = new Label("Introduceti job-ul");
                    TextField nume = new TextField("Scrieti numele..");
                    nume.setBounds(50, 100, 200, 30);
                    TextField varsta = new TextField("Scrieti varsta..");
                    TextField job = new TextField("Scrieti jobul..");
                    name.setBounds(50, 50, 200, 30);
                    age.setBounds(50, 50, 200, 30);
                    job.setBounds(50, 50, 200, 30);
                    Aplicatie.add(name);
                    Aplicatie.add(nume);
                    Aplicatie.add(age);
                    Aplicatie.add(varsta);
                    Aplicatie.add(job_);
                    Aplicatie.add(job);
                    Aplicatie.revalidate();
                    Aplicatie.repaint();
                    nume.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            super.mousePressed(e);
                            nume.setText(null);

                        }
                    });
                    nume.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusGained(FocusEvent e) {
                            super.focusGained(e);
                            nume.setText(null);
                        }
                    });
                    nume.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            super.keyPressed(e);
                            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                employee_del.nume = nume.getText();
                                varsta.requestFocusInWindow();
                            }
                        }
                    });
                    varsta.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            super.mousePressed(e);
                            varsta.setText(null);
                        }
                    });
                    varsta.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusGained(FocusEvent e) {
                            super.focusGained(e);
                            varsta.setText(null);
                        }
                    });
                    varsta.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            super.keyPressed(e);
                            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                employee_del.varsta = Integer.parseInt(varsta.getText());


                                job.requestFocusInWindow();
                            }
                        }
                    });
                    job.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            super.mousePressed(e);
                            job.setText(null);
                        }
                    });
                    job.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusGained(FocusEvent e) {
                            super.focusGained(e);
                            job.setText(null);
                        }
                    });
                    job.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyPressed(KeyEvent e) {
                            super.keyPressed(e);
                            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                employee_del.locdemunca = job.getText();
                                try {
                                    reg.remove_angajat(employee_del);
                                    Label finish = new Label("Persoana stearsa!", CENTER);
                                    finish.setForeground(Color.red);
                                    Aplicatie.add(finish);
                                    finish.setFont(new Font("TimesRoman", Font.PLAIN, 30));
                                    finish.setAlignment(Label.CENTER);
                                    Aplicatie.add(menu);
                                    Aplicatie.revalidate();
                                    Aplicatie.repaint();
                                    menu.setSize(200, 100);
                                    menu.addMouseListener(new MouseAdapter() {
                                        @Override
                                        public void mouseClicked(MouseEvent e) {
                                            super.mouseClicked(e);
                                            Aplicatie.removeAll();
                                            Aplicatie.add(buton1);
                                            Aplicatie.add(buton2);
                                            Aplicatie.add(buton3);
                                            Aplicatie.add(buton4);
                                            Aplicatie.add(buton5);
                                            Aplicatie.revalidate();
                                            Aplicatie.repaint();
                                        }
                                    });
                                } catch (Exception event) {
                                    Aplicatie.removeAll();
                                    Aplicatie.setLayout(null);
                                    Label eroare = new Label("EROARE:ANGAJATUL NU EXISTA!");
                                    eroare.setFont(new Font("TimesRoman", Font.PLAIN, 20));
                                    eroare.setForeground(Color.red);
                                    eroare.setAlignment(Label.CENTER);
                                    eroare.setBounds(200,100,400,100);
                                    menu.setSize(200,100);
                                    menu.setBounds(200,300,400,80);
                                    Aplicatie.add(eroare);
                                    Aplicatie.add(menu);
                                    Aplicatie.revalidate();
                                    Aplicatie.repaint();
                                }

                            }

                        }

                    });

                }

        });
        buton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}


