
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) throws Exception {
        // Receber imagem
        File foto = new File("Projeto_Final\\img\\istockphoto-511366776-612x612.jpg");
        // transformar em buffer
        BufferedImage img = ImageIO.read(foto);
        Scanner sc = new Scanner(System.in);
        int select = 0;
        System.out.println("Digite o metodo que deseja: ");
        System.out.println("1 - Imagem Vermelha");
        System.out.println("2 - Imagem Azul");
        System.out.println("3 - Imagem Verde");
        System.out.println("4 - Imagem Invertida");
        System.out.println("5 - Imagem Original");
        System.out.println("6 -Imagem cinza mais claro");
        System.out.println("7- Imagem cinza medio");
        System.out.println("8- Imagem cinza escuro");
        System.out.println("9- imagem binarizada");
        System.out.println("10- Imabem com brilo aditivo");
        System.out.println("11- Aumento brilho multiplicativo");
        System.out.println("12- Imagem com aumento de tonalidade");
        System.out.println("13 - Converter a imagem em YIQ");
        System.out.println("14 - Aumento banda y ");
        System.out.println("15 - aumento multiplicativo");
        System.out.println("16 inverter banda y");

        select = sc.nextInt();

        switch (select) {
            case 1:
                Metodos.imagemVermelha(img);
                break;
            case 2:
                Metodos.imagemAzul(img);
                break;
            case 3:
                Metodos.imagemVerde(img); 
                break;
            case 4:
                Metodos.imagemInvertida(img);
                break;
            case 5:
                Metodos.exibirImagem(img);
                break;
            case 6:
                Metodos.imagemCinzaMaisClaro(img);
                break;
            case 7:
                Metodos.imagemCinzaMedio(img);
                break;
            case 8:
                Metodos.imagemCinzaMaisEscuro(img);
                break;
            case 9:
                Metodos.imagembinarizada(img);
                break;
            case 10:
                Metodos.imagemBrilhoAditivo(img);
                break;
            case 11:
                Metodos.imagemMultiplicativo(img);
                break;
            case 12:
                Metodos.imagemAumentoTonalidade(img);
                break;
            case 13:
                Metodos.imagemYIQ(img);
                break;
            case 14:
                Metodos.imagemBandaYAditivo(img);
                break;
            case 15:
                Metodos.imagemyiqBandaMultiplicativa(img);
                break;
            case 16:
                Metodos.imagemyiqinverterBanda(img);
                break;

            default:
                System.out.println("Opção inválida");
        }
        sc.close();
    }
}
