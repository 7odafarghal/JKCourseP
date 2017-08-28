import java.util.*;
public class strngs {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        //create the 3d array
        /*for(int i=0;i<10;i++) {
            for (int x = 0; x < 10; x++) {
                System.out.println("table[" + i + "][" + x + "][1] =\"\"; table[" + i + "][" + x + "][2] =\"\"; table[" + i + "][" + x + "][3] =\"\";");
            }
        }*/
        String[][][] table = new String[10][10][3];
        table[0][0][0] ="Zlatan Ibrahimović";        table[0][0][1] ="Doing";            table[0][0][2] ="Taekwondo";
        table[0][1][0] ="Lionel Messi";              table[0][1][1] ="Holding";          table[0][1][2] ="Shirt";
        table[0][2][0] ="Neymar Jr.";                table[0][2][1] ="Dancing";          table[0][2][2] ="Samba";
        table[0][3][0] ="Marco Reus";                table[0][3][1] ="Playing";          table[0][3][2] ="Fifa";
        table[0][4][0] ="Robin van Persie";          table[0][4][1] ="FlyHeading";       table[0][4][2] ="Ball";
        table[0][5][0] ="Fernando Torres";           table[0][5][1] ="Swallowing";       table[0][5][2] ="Tongue";
        table[0][6][0] ="Peter Crouch";              table[0][6][1] ="Headbutting";      table[0][6][2] ="The post";
        table[0][7][0] ="Cristiano Ronaldo";         table[0][7][1] ="Celebrating";      table[0][7][2] ="Goal";
        table[0][8][0] ="David Beckham";             table[0][8][1] ="Filming";          table[0][8][2] ="Movie";
        table[0][9][0] ="James Rodríguez";           table[0][9][1] ="Fingering";        table[0][9][2] ="Head";
        table[1][0][0] ="Superman";                  table[1][0][1] ="Eyelazering";      table[1][0][2] ="Ground";
        table[1][1][0] ="Lex Luthor";                table[1][1][1] ="Planting";         table[1][1][2] ="Zeus Hair";
        table[1][2][0] ="Nightwing";                 table[1][2][1] ="Feeding";          table[1][2][2] ="Batman's Fish";
        table[1][3][0] ="Martian Manhunter";         table[1][3][1] ="Reading";          table[1][3][2] ="Minds";
        table[1][4][0] ="Raven";                     table[1][4][1] ="Opening";          table[1][4][2] ="Dimensional Port";
        table[1][5][0] ="Flash";                     table[1][5][1] ="Bumping";          table[1][5][2] ="Wall";
        table[1][6][0] ="Batman";                    table[1][6][1] ="Releasing";        table[1][6][2] ="Bats";
        table[1][7][0] ="Catwoman";                  table[1][7][1] ="Stealing";         table[1][7][2] ="Diamonds";
        table[1][8][0] ="Harley Quinn";              table[1][8][1] ="Hitting";          table[1][8][2] ="Baseball Bat";
        table[1][9][0] ="Joker";                     table[1][9][1] ="Firing";           table[1][9][2] ="Bazooka";
        table[2][0][0] ="Spiderman";                 table[2][0][1] ="Webbing";          table[2][0][2] ="Thief's Crotch";
        table[2][1][0] ="Loki";                      table[2][1][1] ="Faking";           table[2][1][2] ="Death";
        table[2][2][0] ="Nick Fury";                 table[2][2][1] ="Adjusting";        table[2][2][2] ="Eye Patch";
        table[2][3][0] ="Mystique";                  table[2][3][1] ="Poisoning";        table[2][3][2] ="Cyrebro";
        table[2][4][0] ="Rogue";                     table[2][4][1] ="Putting Down";     table[2][4][2] ="Fire";
        table[2][5][0] ="Falcon";                    table[2][5][1] ="Launching";        table[2][5][2] ="Missiles";
        table[2][6][0] ="Black Widow";               table[2][6][1] ="Blocking";         table[2][6][2] ="Grenade";
        table[2][7][0] ="Captain America";           table[2][7][1] ="Frisbeeing";       table[2][7][2] ="Sheild";
        table[2][8][0] ="Deadpool";                  table[2][8][1] ="Cutting";          table[2][8][2] ="Kebab";
        table[2][9][0] ="Gambit";                    table[2][9][1] ="Throwing";         table[2][9][2] ="Cards";
        table[3][0][0] ="Selena Gomez";              table[3][0][1] ="Killing With";     table[3][0][2] ="Kindness";
        table[3][1][0] ="Lana Del Rey";              table[3][1][1] ="Shooting Down";    table[3][1][2] ="Helecopter";
        table[3][2][0] ="Nicki Minaj";               table[3][2][1] ="Getting";          table[3][2][2] ="Tan";
        table[3][3][0] ="Miley Cyrus";               table[3][3][1] ="Humping";          table[3][3][2] ="Wall";
        table[3][4][0] ="Rihanna";                   table[3][4][1] ="Slapping";         table[3][4][2] ="Michael Cera";
        table[3][5][0] ="Fergie";                    table[3][5][1] ="Shaking";          table[3][5][2] ="MILF";
        table[3][6][0] ="Bebe Rexha";                table[3][6][1] ="Dancing With";     table[3][6][2] ="Somebody";
        table[3][7][0] ="Ke$ha";                     table[3][7][1] ="Boobing";          table[3][7][2] ="Piano";
        table[3][8][0] ="Demi Lovato";               table[3][8][1] ="Shining";          table[3][8][2] ="Neon Lights";
        table[3][9][0] ="Jennifer Lopez";            table[3][9][1] ="Twerking";         table[3][9][2] ="Booty";
        table[4][0][0] ="Xenia Tchoumitcheva";       table[4][0][1] ="Wearing";          table[4][0][2] ="White Socks";
        table[4][1][0] ="Lily Aldridge";             table[4][1][1] ="Training Like";    table[4][1][2] ="Angel";
        table[4][2][0] ="Nathalie Cox";              table[4][2][1] ="Finishing";        table[4][2][2] ="Exam";
        table[4][3][0] ="Martha Hunt";               table[4][3][1] ="Tweeting";         table[4][3][2] ="Questions";
        table[4][4][0] ="Rosie Huntington-Whiteley"; table[4][4][1] ="Walking With";     table[4][4][2] ="Naked Butt";
        table[4][5][0] ="Florence Brudenell-Bruce";  table[4][5][1] ="Smelling";         table[4][5][2] ="Flower";
        table[4][6][0] ="Bella Hadid";               table[4][6][1] ="Priding";          table[4][6][2] ="Islam";
        table[4][7][0] ="Karlie Kloss";              table[4][7][1] ="Eating";           table[4][7][2] ="Sandwich";
        table[4][8][0] ="Dytto";                     table[4][8][1] ="Tutting";          table[4][8][2] ="Fingers";
        table[4][9][0] ="Josie Maran";               table[4][9][1] ="Misleading";       table[4][9][2] ="Cops";
        table[5][0][0] ="Stephanie Mcmahon";         table[5][0][1] ="Having";           table[5][0][2] ="Bella Appetite";
        table[5][1][0] ="Lita";                      table[5][1][1] ="Sleeping In";      table[5][1][2] ="Ring";
        table[5][2][0] ="Nikki Bella";               table[5][2][1] ="Staying";          table[5][2][2] ="Fearless";
        table[5][3][0] ="Miz";                       table[5][3][1] ="Holding";          table[5][3][2] ="Mic";
        table[5][4][0] ="Ronda Rousey";              table[5][4][1] ="Breaking";         table[5][4][2] ="Arms";
        table[5][5][0] ="Vince Mcmahone";            table[5][5][1] ="Summoning";        table[5][5][2] ="Minions";
        table[5][6][0] ="Brie Bella";                table[5][6][1] ="Setting";          table[5][6][2] ="The Mode";
        table[5][7][0] ="Kelly Kelly";               table[5][7][1] ="Pointing At";      table[5][7][2] ="Audience";
        table[5][8][0] ="David Blaine";              table[5][8][1] ="Spitting";         table[5][8][2] ="Fish";
        table[5][9][0] ="Jeff Hardy";                table[5][9][1] ="Whispering In";    table[5][9][2] ="The Wind";
        table[6][0][0] ="Hope Solo";                 table[6][0][1] ="Saving";           table[6][0][2] ="Penalty";
        table[6][1][0] ="Wonder Woman";              table[6][1][1] ="Whipping";         table[6][1][2] ="Whip";
        table[6][2][0] ="Iron Man";                  table[6][2][1] ="Paying";           table[6][2][2] ="Cash";
        table[6][3][0] ="Hilary Duff";               table[6][3][1] ="Turning Into";     table[6][3][2] ="Confetti";
        table[6][4][0] ="Heidi Klum";                table[6][4][1] ="Imitating";        table[6][4][2] ="Jessica Rabbit";
        table[6][5][0] ="AJ LEE";                    table[6][5][1] ="Seducing";         table[6][5][2] ="Wrestlers";
        table[6][6][0] ="Hager Mohammed";            table[6][6][1] ="Shutting";         table[6][6][2] ="Mouth";
        table[6][7][0] ="Eminem";                    table[6][7][1] ="Waving";           table[6][7][2] ="Middle Finger";
        table[6][8][0] ="Angelina Jolie";            table[6][8][1] ="Curving";          table[6][8][2] ="Bullet";
        table[6][9][0] ="Will Smith";                table[6][9][1] ="Killing";          table[6][9][2] ="Dog";
        table[7][0][0] ="Sam Smith";                 table[7][0][1] ="Fucking";          table[7][0][2] ="Boy";
        table[7][1][0] ="Lil Wayne";                 table[7][1][1] ="Signing";          table[7][1][2] ="Tits";
        table[7][2][0] ="Nial Horan";                table[7][2][1] ="Slowing";          table[7][2][2] ="Hands";
        table[7][3][0] ="Michael Jackson";           table[7][3][1] ="Moonwalking With"; table[7][3][2] ="Gloves";
        table[7][4][0] ="R.Kelly";                   table[7][4][1] ="Dangling On";      table[7][4][2] ="Couch";
        table[7][5][0] ="frank sinatra";             table[7][5][1] ="Drinking";         table[7][5][2] ="Whiskey";
        table[7][6][0] ="Pitbull";                   table[7][6][1] ="Pounding";         table[7][6][2] ="Alarm";
        table[7][7][0] ="Kanye West";                table[7][7][1] ="Pirating";         table[7][7][2] ="Software";
        table[7][8][0] ="Twista";                    table[7][8][1] ="Chopping";         table[7][8][2] ="Songs";
        table[7][9][0] ="Justin Bieber";             table[7][9][1] ="Saying";           table[7][9][2] ="Sorry";
        table[8][0][0] ="Scarlett Johanson";         table[8][0][1] ="Tripping On";      table[8][0][2] ="Sidewalk";
        table[8][1][0] ="Lindnsay Lohan";            table[8][1][1] ="Reciting";         table[8][1][2] ="Quran";
        table[8][2][0] ="Nicole Kidman";             table[8][2][1] ="Changing";         table[8][2][2] ="Clothes";
        table[8][3][0] ="Megan Fox";                 table[8][3][1] ="Laying On";        table[8][3][2] ="Motorbike";
        table[8][4][0] ="Rosamund Pike";             table[8][4][1] ="Slitting";         table[8][4][2] ="Throat";
        table[8][5][0] ="Vanessa Hudgens";           table[8][5][1] ="Robbing";          table[8][5][2] ="Restaurant";
        table[8][6][0] ="Blake Lively";              table[8][6][1] ="Kicking";          table[8][6][2] ="Shark";
        table[8][7][0] ="Cara Delevigne";            table[8][7][1] ="Shaving";          table[8][7][2] ="Head";
        table[8][8][0] ="Teresa Palmer";             table[8][8][1] ="Teasing";          table[8][8][2] ="Captive";
        table[8][9][0] ="Charlize Theron";           table[8][9][1] ="Kissing";          table[8][9][2] ="Dead Fish";
        table[9][0][0] ="Sam Jackson";               table[9][0][1] ="Leaning On";       table[9][0][2] ="Seat";
        table[9][1][0] ="Leo Dicaprio";              table[9][1][1] ="Banging/Drawing";  table[9][1][2] ="Margot Robbie/Naked Girl";
        table[9][2][0] ="Nicholas Hoult";            table[9][2][1] ="Transforming to";  table[9][2][2] ="Beast";
        table[9][3][0] ="Mark Wahlberg";             table[9][3][1] ="Working out";      table[9][3][2] ="Belly";
        table[9][4][0] ="Ryan Gosling";              table[9][4][1] ="Laughing at";      table[9][4][2] ="Oscars";
        table[9][5][0] ="Vin Diesel";                table[9][5][1] ="Riding";           table[9][5][2] ="American Muscle";
        table[9][6][0] ="Paul Walker";               table[9][6][1] ="Jumping Off";      table[9][6][2] ="Bus Top";
        table[9][7][0] ="keanu reeves";              table[9][7][1] ="Dodging/Fighting"; table[9][7][2] ="Bullets/Clones";
        table[9][8][0] ="Tom Cruise";                table[9][8][1] ="Sitting on";       table[9][8][2] ="Khalefa Tower";
        table[9][9][0] ="Jared Leto";                table[9][9][1] ="Singing";          table[9][9][2] ="Rock";
        int a,b;
        int counter = 0;//this counter iterates only between three values because there are only three types of strings the person the action the object
        String inputer = masih.nextLine();
        int[] num = new int[inputer.length()];
        //Putting every character in the string in an int array
        for(int i=0;i<inputer.length();i++){
            num[i] = inputer.charAt(i)-'0';//subtracting that 0 to get the real integer not the ASCII value
        }
        //this loops jumps by two steps because every string in the table have a category -which is the first number-
        //and the string itself -which is the second number- but inside the loop
        //I take the two numbers by assigning a second variable the value i+1 so i don't miss the second number in the jump
        for(int i=0;i<num.length;i+=2){
            if(counter>2)counter = 0;
            a = num[i];
            b = num[(i+1)];
            if(counter>1) System.out.print(table[a][b][counter] +".    ");
            else System.out.print(table[a][b][counter] +". ");
            counter++;
        }
    }
}
