import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainProject {
    static List<String> listMahasiswa = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer choice = 0;
        Integer number = 1;
        do{
            System.out.println("====== Menu =====");
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. Show List Mahasiswa");
            System.out.println("3. Edit Mahasiswa");
            System.out.println("4. Remove Mahasiswa");
            System.out.println("5. Exit Program");
            System.out.println("Your Choice :");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Mahasiswa name : ");
                    input.nextLine();
                    String name = input.nextLine();
                    addMahasiswa(name);
                    break;
                case 2:
                    showMahasiswa();
                    break;
                case 3:
                    showMahasiswa();
                    System.out.println("Input number Mahasiswa :");
                    number = input.nextInt();
                    if(number > listMahasiswa.size()){
                        System.out.println("Your input is invalid");
                        break;
                    }
                    System.out.println("Mahasiswa new name : ");
                    input.nextLine();
                    String newName = input.nextLine();
                    editMahasiswa(number, newName);
                    break;
                case 4:
                    showMahasiswa();
                    System.out.println("Input number Mahasiswa :");
                    number = input.nextInt();
                    if(number > listMahasiswa.size()){
                        System.out.println("Your input is invalid");
                        break;
                    }
                    deleteMahasiswa(number);
                    break;
                default:
                    System.exit(0);
            }
            System.out.println("\n\n\n");
        }while (choice < 5);

    }

    public static void addMahasiswa(String name){
        listMahasiswa.add(name);
    }

    public static void showMahasiswa(){
        System.out.println("Daftar Mahasiswa");
        for (int iter = 0; iter < listMahasiswa.size(); iter++) {
            System.out.println((iter+1) + " - " + listMahasiswa.get(iter));
        }
    }

    public static void editMahasiswa(Integer number, String newName){
        listMahasiswa.set((number - 1), newName);
    }
    public static void deleteMahasiswa(Integer number){
        listMahasiswa.remove((number - 1));
    }
}
