import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class opakovanie {

    public static void main(String[] args) {


        Location castle = new Location ("Hrad",  "Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti. Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");

        Location forest = new Location    ("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");

        Location forestPath = new Location("Lesní rozcestí",	"Nacházíš se na lesním rozcestí.");

        Location forest2 = new Location  ("Les",	"Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");

        Location oak = new Location ("Rybník",	"Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek od tebe je dřevěná plošina se stavidlem.");

        Location forest3 = new Location  ("Les",	"Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");

        Location house = new Location ("Dům",	"Stojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line z hromady vedle vstupních dveří.");


            castle.setRight(forest);
            forest.setRight(forestPath);
            forest.setLeft(castle);
            forestPath.setLeft(forest);
            forestPath.setRight(forest2);
            forestPath.setDown(forest3);
            forest2.setLeft(forestPath);
            forest2.setRight(oak);
            oak.setLeft(forest2);
            forest3.setUp(forestPath);
            forest3.setRight(house);



            boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        Location currentLocation = castle;
        while (isRunning == true){

            currentLocation.getDescription();
            System.out.println("zadaj prikaz: koniec alebo goto[juh/sever/zapad/vychod]");
            String command = sc.nextLine();

            if (command.equals("koniec")){
                isRunning = false;
            }else{
                switch (command){
                    case "goto juh":
                        currentLocation = currentLocation.getDown();
                        break;

                    case "goto sever":
                        currentLocation = currentLocation.getUp();
                        break;
                    case "goto zapad":
                        currentLocation = currentLocation.getLeft();

                        break;
                    case "goto vychod":
                        currentLocation = currentLocation.getRight();

                        break;
                    default:
                        System.out.println("zle zadany prikaz");
                        break;

                }
            }
        }

    }












}
