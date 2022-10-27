package gui.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.swing.*;
import java.awt.*;

public class Backgrounds {

    private static final Logger log = LoggerFactory.getLogger(Backgrounds.class);

    private JComponent startImage = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image logo = new ImageIcon(this.getClass().getResource(
                        "/image/main/backgroun.png")).getImage();

                int h = getHeight();
                int w = getWidth();
                for (int x = 0; x <= h / h; x++) {
                    for (int y = 0; y <= w / w; y++) {
                        g.drawImage(logo, x * 800, y * 600, null);
                    }
                }
                log.info("Image background.png loaded.");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent downloadImage = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image logo = new ImageIcon(this.getClass().getResource(
                        "/image/main/loadimage.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for (int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g.drawImage(logo, x * 800, y * 600, null);
                    }
                }
                log.info("Image loadimage.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent onePhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/1.png")).getImage();
                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 1.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent twoPhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/2.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 2.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent threePhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/3.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 3.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent fourPhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/4.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 4.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent fivePhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/5.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 5.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent sixPhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/6.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 6.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent sevenPhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/7.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 7.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent eightPhase = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/blackout/8.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image 8.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseOne = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color1.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color1.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseTwo = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color2.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color2.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseThree = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color3.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color3.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseFour = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color4.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color4.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseFive = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color5.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color5.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseSix = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color6.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color6.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseSeven = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color7.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color7.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    private JComponent colorPhaseEight = new JComponent() {
        @Override
        protected void paintComponent(Graphics g) {
            try {
                Graphics2D g2 = (Graphics2D) g;
                Image i = new ImageIcon(this.getClass().getResource(
                        "/image/color/color.png")).getImage();

                int h = getHeight();
                int w = getWidth();

                for(int x = 0; x <= h; x++){
                    for (int y = 0; y <= w; y++){
                        g2.drawImage(i, x * 800, y * 600, null);
                    }
                }
                log.info("Image color.png loaded");
            } catch (Exception e){
                log.error("Failed to load Image:", e);
            }
        }
    };

    public void update(JFrame frame){
        for (int i = 0; i <= 15; i++){
            switch (i){
                case 0:
                    try {
                        frame.setContentPane(onePhase);
                        frame.validate();
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 1:
                    try {
                        frame.setContentPane(twoPhase);
                        frame.validate();
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 2:
                    try {
                        frame.setContentPane(threePhase);
                        frame.validate();
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 3:
                    try {
                        frame.setContentPane(fourPhase);
                        frame.validate();
                        Thread.sleep(135);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 4:
                    try {
                        frame.setContentPane(fivePhase);
                        frame.validate();
                        Thread.sleep(135);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 5:
                    try {
                        frame.setContentPane(sixPhase);
                        frame.validate();
                        Thread.sleep(135);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 6:
                    try {
                        frame.setContentPane(sevenPhase);
                        frame.validate();
                        Thread.sleep(135);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 7:
                    try {
                        frame.setContentPane(eightPhase);
                        frame.validate();
                        Thread.sleep(5350);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 8:
                    try {
                        frame.setContentPane(colorPhaseOne);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 9:
                    try {
                        frame.setContentPane(colorPhaseTwo);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 10:
                    try {
                        frame.setContentPane(colorPhaseThree);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 11:
                    try {
                        frame.setContentPane(colorPhaseFour);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 12:
                    try {
                        frame.setContentPane(colorPhaseFive);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 13:
                    try {
                        frame.setContentPane(colorPhaseSix);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 14:
                    try {
                        frame.setContentPane(colorPhaseSeven);
                        frame.validate();
                        Thread.sleep(200);
                    } catch (InterruptedException e){
                        log.error(e.getMessage(), e);
                    }
                    break;
                case 15:
                    try {
                        frame.setContentPane(colorPhaseEight);
                        frame.validate();
                    } catch (Exception e){
                        log.error(e.getMessage(), e);
                    }
            }
        }
    }

    public JComponent getStartImage() {
        return startImage;
    }

    public JComponent getDownloadImage() {
        return downloadImage;
    }
}
