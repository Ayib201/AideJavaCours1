package com.groupeisi;

import com.groupeisi.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Combien utilisateur voulez-vous entrer ?");
        int number = in.nextInt();
        in.nextLine();
        for (int i = 0; i < number; i++) {
            System.out.print("Please enter your name: \n");
            String name = in.nextLine();
            System.out.print("Saisir votre email \n");
            String email = in.nextLine();
            User user = new User(name, email);
            users.add(user);
        }
        for(User user : users){
            System.out.println("Nom : " + user.getName()+ " Email : " + user.getEmail()+ '\n');
        }
//        User user = new User();
//        System.out.print("Please enter your name: \n");
//        String name = in.nextLine();
//        user.setName(name);
//        System.out.print("Voulez-vous entrez votre email \n");
//        String response = in.nextLine();
//        if (response.equalsIgnoreCase("oui")){
//            System.out.print("Saisir votre email \n");
//            String email = in.nextLine();
//            user.setEmail(email);
//            System.out.println("Nom :" + user.getName() + " email " + user.getEmail());
//        }else {
//            System.out.println(user.getName());
//        }

    }

}