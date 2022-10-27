package gui;

import gui.EventListener.MD.EventExitMD;
import gui.EventListener.MD.EventInMD;
import gui.EventListener.ShaN.EventExitSHA;
import gui.EventListener.ShaN.EventOpenSHA;
import gui.EventListener.ShaT.EventExit;
import gui.EventListener.ShaT.EventIn;
import gui.components.Backgrounds;
import gui.components.CustomJButton;
import gui.components.CustomJPanel;
import gui.components.CustomProgressBar;
import manager.FileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import system.FileLoader;
import system.Sounds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.concurrent.CyclicBarrier;
import javax.swing.UIManager.*;

public class WorkWindow {

    private static final int WIDTH = 800;
    private static final int HEITH = 600;

    private static final Logger log = LoggerFactory.getLogger(WorkWindow.class);

    private String title;
    private JFrame frame = null;
    private WorkWindow window;
    private boolean check = false;
    private Backgrounds g;
    private CustomJPanel place = null;
    private CustomJPanel placeWork = null;
    private CustomJButton start = null;
    private CustomJButton md5 = null;
    private CustomJButton sha1 = null;
    private CustomJButton sha256 = null;
    private CustomJButton openFile = null;
    private CustomJButton exit = null;
    private JTextField out;
    private JTextField in;
    private JLabel outText;
    private JLabel inText;



    public WorkWindow(String title){
        this.title = title;
    }

    public void createWindow(){
        g = new Backgrounds();
        frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEITH);
        frame.setLocationRelativeTo(null);
        frame.setTitle(title);
        frame.setContentPane(g.getStartImage());
        frame.setIconImage(new ImageIcon(this.getClass().getResource("/image/main/icon.png")).getImage());

        place = new CustomJPanel(new GridBagLayout(), new Color(255,255,255),340,190,
                100,50);
        place.build();
        frame.add(place);

        start = new CustomJButton("Запуск", new Color(255,204,153),
                90,40, new Font("TimesRoman", Font.BOLD, 18));
        start.build();
        place.add(start);

        sha1 = new CustomJButton("SHA-1", new Color(255,204,153),
                120,50, new Font("TimesRoman", Font.BOLD, 18));
        sha1.build();

        sha256 = new CustomJButton("SHA-256", new Color(255,204,153),
                120,50, new Font("TimesRoman", Font.BOLD, 18));
        sha256.build();

        md5 = new CustomJButton("MD5", new Color(255,204,153),
                120,50, new Font("TimesRoman", Font.BOLD, 18));
        md5.build();

        log.info("Adding components completed successfully !");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g = new Backgrounds();
                frame.setContentPane(g.getDownloadImage());
                frame.validate();

                CustomJPanel panel = new CustomJPanel(new GridBagLayout(),
                        new Color(252,84,0), 200, 220, 600, 150);
                panel.build();
                frame.add(panel);

                CustomProgressBar l = new CustomProgressBar(0, 100,0, null);
                l.setForeground(new Color(102,255,0));
                l.setBackground(new Color(255,255,255));
                l.setPreferredSize(new Dimension(250, 40));
                l.setStringPainted(true);
                panel.add(l, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(20,0,0,250),0,0));

                CustomProgressBar s = new CustomProgressBar(0,100,0, null);
                s.setForeground(new Color(102,255,0));
                s.setBackground(new Color(255,255,255));
                s.setPreferredSize(new Dimension(250, 40));
                s.setStringPainted(true);
                panel.add(s, new GridBagConstraints(0,0,1,1, 1,1,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(50,0,0,250),0,0));
                log.info("Progress bar created !");

                Runnable run = () -> {
                    log.info("Stream " + Thread.currentThread() + " is running.");
                    new Thread(() -> {
                        log.info("Stream " + Thread.currentThread() + " is running");
                        try (Sounds snd = new Sounds("/sound/future.mp3")) {
                            //snd.play();
                            log.info("Sound start !");
                        } catch (Exception ex) {
                            log.error("Failed to start the tune!");
                            ex.printStackTrace();
                        }
                    }).start();

                    try {
                        Thread.sleep(1000);
                        g.update(frame);

                        placeWork = new CustomJPanel(new GridBagLayout(), new Color(255,255,255),
                                15,150,150,300);
                        placeWork.build();
                        frame.add(placeWork);

                        placeWork.add(sha1, new GridBagConstraints(0,0,1,1,1,1,
                                GridBagConstraints.CENTER, GridBagConstraints.NONE,
                                new Insets(0,0,170,0),0,0));
                        placeWork.add(sha256, new GridBagConstraints(0,0,1,1,1,1,
                                GridBagConstraints.CENTER,GridBagConstraints.NONE,
                                new Insets(0,0,0,0),0,0));
                        placeWork.add(md5, new GridBagConstraints(0,0,1,1,1,1,
                                GridBagConstraints.CENTER,GridBagConstraints.NONE,
                                new Insets(170,0,0,0),0,0));

                        frame.repaint();
                        frame.validate();
                    } catch (Exception exc){
                        exc.printStackTrace();
                    }
                };

                CyclicBarrier task = new CyclicBarrier(2,run);

                FileLoader load = new FileLoader(task);
                load.loadLibrary(l);
                load.loadSound(s);
                frame.validate();
            }
        });

        sha1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placeWork.setVisible(false);

                CustomJPanel panelSha1 = new CustomJPanel(new GridBagLayout(), new Color(255,255,255),
                        250,170, 300,250);
                panelSha1.build();
                frame.add(panelSha1);

                out = new JTextField();
                out.setPreferredSize(new Dimension(300,40));
                panelSha1.add(out, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(50,0,0,0),0,0));

                openFile = new CustomJButton("Открыть", new Color(255,204,153),
                        120,50, new Font("TimesRoman", Font.BOLD, 18));
                openFile.addActionListener(new EventOpenSHA(out));
                openFile.build();
                panelSha1.add(openFile, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(30,0,0,0),0,0));

                exit = new CustomJButton("Назад", new Color(255,204,153),
                        120,50, new Font("TimesRoman", Font.BOLD, 18));
                exit.build();
                exit.addActionListener(new EventExitSHA(placeWork, panelSha1));
                panelSha1.add(exit, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.SOUTH, GridBagConstraints.NONE,
                        new Insets(0,0,10,0),0,0));

                outText = new JLabel("Вывод:");
                outText.setFont(new Font("TimesRoman", Font.BOLD, 18));
                panelSha1.add(outText, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(20,0,0,0),0,0));

                frame.validate();
                frame.repaint();
            }
        });

        sha256.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placeWork.setVisible(false);

                CustomJPanel panelSha256 = new CustomJPanel(new GridBagLayout(), new Color(255,255,255),
                        250,170, 300,250);
                panelSha256.build();
                frame.add(panelSha256);

                exit = new CustomJButton("Назад", new Color(255,204,153),
                        120,50, new Font("TimesRoman", Font.BOLD, 18));
                exit.addActionListener(new EventExit(placeWork, panelSha256));
                exit.build();
                panelSha256.add(exit, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.SOUTH, GridBagConstraints.NONE,
                        new Insets(0,0,10,0),0,0));

                out = new JTextField();
                out.setPreferredSize(new Dimension(300,40));
                panelSha256.add(out, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(50,0,0,0),0,0));

                in = new JTextField();
                in.setPreferredSize(new Dimension(300,40));
                in.getDocument().addDocumentListener(new EventIn(in, out));
                panelSha256.add(in, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(50,0,0,0),0,0));

                inText = new JLabel("Текст:");
                inText.setFont(new Font("TimesRoman", Font.BOLD, 18));
                panelSha256.add(inText, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(25,0,0,0),0,0));

                outText = new JLabel("Вывод:");
                outText.setFont(new Font("TimesRoman", Font.BOLD, 18));
                panelSha256.add(outText, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(0,0,15,0),0,0));
            }
        });

        md5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placeWork.setVisible(false);

                CustomJPanel panelMD = new CustomJPanel(new GridBagLayout(), new Color(255,255,255),
                        250,170, 300,250);
                panelMD.build();
                frame.add(panelMD);

                exit = new CustomJButton("Назад", new Color(255,204,153),
                        120,50, new Font("TimesRoman", Font.BOLD, 18));
                exit.addActionListener(new EventExitMD(panelMD, placeWork));
                exit.build();
                panelMD.add(exit, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.SOUTH, GridBagConstraints.NONE,
                        new Insets(0,0,10,0),0,0));

                out = new JTextField();
                out.setPreferredSize(new Dimension(300,40));
                panelMD.add(out, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.CENTER, GridBagConstraints.NONE,
                        new Insets(50,0,0,0),0,0));

                in = new JTextField();
                in.setPreferredSize(new Dimension(300,40));
                in.getDocument().addDocumentListener(new EventInMD(in, out));
                panelMD.add(in, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(50,0,0,0),0,0));

                inText = new JLabel("Текст:");
                inText.setFont(new Font("TimesRoman", Font.BOLD, 18));
                panelMD.add(inText, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.NORTH, GridBagConstraints.NONE,
                        new Insets(25,0,0,0),0,0));

                outText = new JLabel("Вывод:");
                outText.setFont(new Font("TimesRoman", Font.BOLD, 18));
                panelMD.add(outText, new GridBagConstraints(0,0,1,1,1,1,
                        GridBagConstraints.CENTER,GridBagConstraints.NONE,
                        new Insets(0,0,15,0),0,0));
            }
        });

        log.info("Window activated.");
        frame.setVisible(true);

        File createWorkDir = new File(FileManager.getWorkDir().getAbsolutePath());
        File logs = new File(FileManager.getWorkDir().getAbsolutePath() +
                 File.separator + "logs");
        if (!logs.exists() || !logs.mkdirs()){
            logs.mkdirs();
            log.info("logs directory created !");
        }
        File libs = new File(FileManager.getWorkDir().getAbsolutePath() +
                File.separator + "libraries");

        if (!libs.exists() || !libs.mkdirs()){
            libs.mkdirs();
            log.info("libraries directory created !");
        }
    }

    public static void main(String[] args) {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        WorkWindow start = new WorkWindow("Parallelepiped");
        start.createWindow();
    }
}
