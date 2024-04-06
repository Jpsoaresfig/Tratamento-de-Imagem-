
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Metodos {

    // metodo para so deixar a imagem com a banda vermelha
    public static void imagemVermelha(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        // Percorre todos os pixels da imagem
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                // Obtém o valor RGB do pixel atual
                int corOriginal = imagem.getRGB(x, y);

                // Extrai os componentes de cor
                int vermelho = (corOriginal >> 16) & 0xFF; // Componente vermelho (R)
                int verde = (corOriginal >> 8) & 0xFF; // Componente verde (G)
                int azul = corOriginal & 0xFF; // Componente azul (B)

                // Reduz a intensidade dos componentes verde e azul
                verde = 0;
                azul = 0;
                // Constrói o novo pixel com os componentes de cor modificados
                int novoPixel = (vermelho << 16) | (verde << 8) | azul;
                // Define o novo pixel na imagem
                imagem.setRGB(x, y, novoPixel);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para so deixar a imagem com a banda azul
    public static void imagemAzul(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {

                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                verde = 0;
                azul = 0;

                int novoPixel = (azul << 16) | (verde << 8) | vermelho;

                imagem.setRGB(x, y, novoPixel);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para so deixar a imagem com a banda verde
    public static void imagemVerde(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int verde = (corOriginal >> 8) & 0xFF;

                int novoPixel = (0 << 16) | (verde << 8) | 0;

                imagem.setRGB(x, y, novoPixel);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para inveter as cores da imagem
    public static void imagemInvertida(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                vermelho = 255 - vermelho;
                verde = 255 - verde;
                azul = 255 - azul;

                int novoPixel = (vermelho << 16) | (verde << 8) | azul;
                imagem.setRGB(x, y, novoPixel);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para exibir o tom de cinza mais claro (192, 192, 192)
    public static void imagemCinzaMaisClaro(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                vermelho = 192;
                ;
                verde = 192;
                azul = 192;

                int novaCor = (vermelho << 16) | (verde << 8) | azul;
                imagem.setRGB(x, y, novaCor);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para exibir o tom de cinza medio (128, 128, 128)
    public static void imagemCinzaMedio(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                vermelho = 128;
                ;
                verde = 128;
                azul = 128;

                int novaCor = (vermelho << 16) | (verde << 8) | azul;
                imagem.setRGB(x, y, novaCor);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para exibir o tom de cinza escuro (64, 64, 64)
    public static void imagemCinzaMaisEscuro(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                vermelho = 64;
                verde = 64;
                azul = 64;

                int novaCor = (vermelho << 16) | (verde << 8) | azul;
                imagem.setRGB(x, y, novaCor);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para binarizar a imagem
    public static void imagembinarizada(BufferedImage imagem) {
        int altura = imagem.getHeight();
        int largura = imagem.getWidth();

        int limiar = 127; // Limiar

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                // Calcular a média dos componentes de cor
                int media = (vermelho + verde + azul) / 3;

                // Aplicar o limiar para binarização
                if (media > limiar) {
                    // Pixels claros são definidos como branco (255, 255, 255)
                    imagem.setRGB(x, y, 0xFFFFFF); // Branco em RGB
                } else {
                    // Pixels escuros são definidos como preto (0, 0, 0)
                    imagem.setRGB(x, y, 0x000000); // Preto em RGB
                }
            }
        }
        exibirImagem(imagem);
    }

    public static void imagemBrilhoAditivo(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        // Valor de aumento do brilho
        int aumentoBrilho = 50;

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                // Adiciona o valor de aumento do brilho a cada componente de cor
                vermelho = Math.min(255, vermelho + aumentoBrilho);
                verde = Math.min(255, verde + aumentoBrilho);
                azul = Math.min(255, azul + aumentoBrilho);

                int novaCor = (vermelho << 16) | (verde << 8) | azul;

                imagem.setRGB(x, y, novaCor);
            }
        }
        exibirImagem(imagem);
    }

    // metodo brilho multiplicativo
    public static void imagemMultiplicativo(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        // Valor de aumento do brilho
        double multiplicativodobrilho = 0.9;

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                // Adiciona o valor de aumento do brilho a cada componente de cor
                vermelho = (int) Math.min(255, vermelho * multiplicativodobrilho);
                verde = (int) Math.min(255, verde * multiplicativodobrilho);
                azul = (int) Math.min(255, azul * multiplicativodobrilho);

                int novaCor = (vermelho << 16) | (verde << 8) | azul;

                imagem.setRGB(x, y, novaCor);
            }
        }
        exibirImagem(imagem);
    }

    // metodo para aumentar a tonalidade da imagem
    public static void imagemAumentoTonalidade(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        // Valor de aumento de tonalidade
        int aumentoTonalidade = 100;

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                // Adiciona o valor de aumento do brilho a cada componente de cor
                vermelho = Math.min(255, vermelho + aumentoTonalidade);
                verde = Math.min(255, verde + aumentoTonalidade);
                azul = Math.min(255, azul + aumentoTonalidade);

                int novaCor = (vermelho << 16) | (verde << 8) | azul;

                imagem.setRGB(x, y, novaCor);
            }
        }
        exibirImagem(imagem);
    }

    // Método para converter de RGB para YIQ
    public static void imagemYIQ(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        // Percorre todos os pixels da imagem
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {

                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                // Converte de RGB para YIQ
                double Y = 0.299 * vermelho + 0.587 * verde + 0.114 * azul;
                double I = 0.596 * vermelho - 0.274 * verde - 0.322 * azul;
                double Q = 0.211 * vermelho - 0.523 * verde + 0.312 * azul;

                // Limita os valores de YIQ para o intervalo [0, 255]
                Y = Math.max(0, Math.min(255, Y));
                I = Math.max(0, Math.min(255, I));
                Q = Math.max(0, Math.min(255, Q));

                int novaCor = ((int) Y << 16) | ((int) I << 8) | (int) Q;

                imagem.setRGB(x, y, novaCor);
            }
        }

        exibirImagem(imagem);
    }

    // metodo para aumentar a banda y aditivo
    public static void imagemBandaYAditivo(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {

                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                double Y = 0.299 * vermelho + 0.587 * verde + 0.114 * azul;
                double I = 0.596 * vermelho - 0.274 * verde - 0.322 * azul;
                double Q = 0.211 * vermelho - 0.523 * verde + 0.312 * azul;

                Y = Math.max(0, Math.min(255, Y));

                // Constrói a nova cor YIQ
                int novaCor = ((int) Y << 16) | ((int) I << 8) | (int) Q;

                imagem.setRGB(x, y, novaCor);
            }
        }

        exibirImagem(imagem);
    }

    // Método para aumentar a banda Y multiplicativamente
    public static void imagemyiqBandaMultiplicativa(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        double multiplicador = 1.5;

        // Percorre todos os pixels da imagem
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {

                int corOriginal = imagem.getRGB(x, y);

                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                double Y = 0.299 * vermelho + 0.587 * verde + 0.114 * azul;
                double I = 0.596 * vermelho - 0.274 * verde - 0.322 * azul;
                double Q = 0.211 * vermelho - 0.523 * verde + 0.312 * azul;

                Y *= multiplicador;
                I *= multiplicador;
                Q *= multiplicador;

                int novaCor = ((int) Y << 16) | ((int) I << 8) | (int) Q;

                imagem.setRGB(x, y, novaCor);
            }
        }

        exibirImagem(imagem);
    }

    // Método para inverter a banda Y (luminância)
    public static void imagemyiqinverterBanda(BufferedImage imagem) {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();

        // Percorre todos os pixels da imagem
        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                // Obtém a cor original do pixel
                int corOriginal = imagem.getRGB(x, y);

                // Extrai os componentes de cor YIQ
                int vermelho = (corOriginal >> 16) & 0xFF;
                int verde = (corOriginal >> 8) & 0xFF;
                int azul = corOriginal & 0xFF;

                // Calcula a nova banda Y invertendo seu valor
                double Y = 0.299 * vermelho + 0.587 * verde + 0.114 * azul;
                Y = Math.max(0, Math.min(255, 255 - Y));

                int novaCor = ((int) Y << 16) | ((int) verde << 8) | azul;

                imagem.setRGB(x, y, novaCor);
            }
        }

        exibirImagem(imagem);
    }

    // Método para exibir uma imagem em um JFrame
    public static void exibirImagem(BufferedImage imagem) {
        JFrame frame = new JFrame("Exibindo Imagem");
        JLabel label = new JLabel(new ImageIcon(imagem));
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
