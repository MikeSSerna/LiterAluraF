package com.maico.LiterAlura;

import com.maico.LiterAlura.controller.GutendexController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private GutendexController gutendexController;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menú LiterAlura ---");
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingresa el título del libro: ");
                    String title = scanner.nextLine();
                    String result = gutendexController.searchBooks(title);
                    System.out.println(result);
                    break;
                case 2:
                    running = false;
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
