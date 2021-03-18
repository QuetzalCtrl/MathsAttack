class Projet extends Program{
  
  final char P = '+';
  final char M = '-';
  final char F = '*';
  final String ANSI_RESET = "\u001B[0m";
  final String ANSI_BLACK = "\u001B[30m";
  final String ANSI_WHITE = "\u001B[37m";
  final String ANSI_GREEN = "\u001B[32m";
  final String ANSI_BLUE = "\u001B[34m";
  final String ANSI_RED = "\u001B[31m";

  void algorithm(){
    
    boolean choixQuitter = false;
    while(!choixQuitter){
      println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      println(ANSI_RED + "• ▄  ▄ ·. ▄▄▄· ▄▄▄▄▄ ▄ .▄.▄▄ ·      ▄▄▄· ▄▄▄▄▄▄▄▄▄▄ ▄▄▄·  ▄▄· ▄ •▄     ▄▄ ");
      println("·██ ▐███▪▐█ ▀█ •██  ██▪▐█▐█ ▀.     ▐█ ▀█ •██  •██  ▐█ ▀█ ▐█ ▌▪█▌▄▌▪    ██▌");
      println("▐█ ▌▐▌▐█·▄█▀▀█  ▐█.▪██▀▐█▄▀▀▀█▄    ▄█▀▀█  ▐█.▪ ▐█.▪▄█▀▀█ ██ ▄▄▐▀▀▄·    ▐█·");
      println("██ ██▌▐█▌▐█ ▪▐▌ ▐█▌·██▌▐▀▐█▄▪▐█    ▐█ ▪▐▌ ▐█▌· ▐█▌·▐█ ▪▐▌▐███▌▐█.█▌    .▀ ");
      println("▀▀   ▪▀▀▀ ▀  ▀  ▀▀▀ ▀▀▀ · ▀▀▀▀      ▀  ▀  ▀▀▀  ▀▀▀  ▀  ▀ ·▀▀▀ ·▀  ▀     ▀ " + ANSI_RESET);
      println();
      extensions.CSVFile records = loadCSV("Scores.csv");
      println("              Meilleurs Scores pour la difficulté 4: ");
      String[][] theRecords = new String[6][3];
      for(int i = 0; i < length(theRecords, 1); i++){
        print("                 ");
        for(int j = 0; j < length(theRecords, 2); j++){
          theRecords[i][j] = getCell(records, i, j);
          print(theRecords[i][j] + "        ");
        }
        println();
      }
      println();
      menu();
      println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      print("Que voulez vous faire ? \n  > ");
      switch (readString()){
        case "1": jeu();
        break;
        case "2": menuRegles();
        break;
        case "3": println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nVous avez décidé de quitter le jeu! Bye bye!");
        choixQuitter = true;
        break;
        case "4": menuSecret();
        break;
        default: print("Choisissez une valeur correcte");
        break;
      }
    }
  }

  //random entre un min (inclus) et un max (exclus)
  int randomInt (int min, int max){
    return ((int)(random()*(max-min)+min));
  }

  void jeu (){
    Calcul[][] grille = initTab();
    String resultat = "";
    int temps = 10000;
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    println(ANSI_GREEN + "              ██████" + ANSI_BLUE + "╗ " + ANSI_GREEN + " █████" + ANSI_BLUE + "╗ "  + ANSI_GREEN + "███" + ANSI_BLUE + "╗  " + ANSI_GREEN +" ███" + ANSI_BLUE + "╗"  + ANSI_GREEN + "███████" + ANSI_BLUE + "╗   "  + ANSI_GREEN + " ███" + ANSI_BLUE + "╗  "  + ANSI_GREEN + " ███" + ANSI_BLUE + "╗"  + ANSI_GREEN + " ██████" + ANSI_BLUE + "╗"  + ANSI_GREEN + " ██████" + ANSI_BLUE + "╗"  + ANSI_GREEN + " ███████" + ANSI_BLUE + "╗");
    println(ANSI_GREEN + "             ██" + ANSI_BLUE + "╔════╝"  + ANSI_GREEN + " ██" + ANSI_BLUE + "╔══"  + ANSI_GREEN + "██" + ANSI_BLUE + "╗"  + ANSI_GREEN + "████" + ANSI_BLUE + "╗ "  + ANSI_GREEN + "████" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔════╝    "  + ANSI_GREEN + "████" + ANSI_BLUE + "╗ "  + ANSI_GREEN + "████" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔═══"  + ANSI_GREEN + "██" + ANSI_BLUE + "╗"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔══"  + ANSI_GREEN + "██" + ANSI_BLUE + "╗"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔════╝");
    println("             "  + ANSI_GREEN + "██" + ANSI_BLUE + "║  "  + ANSI_GREEN + "███" + ANSI_BLUE + "╗"  + ANSI_GREEN + "███████" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔"  + ANSI_GREEN + "████" + ANSI_BLUE + "╔"  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "█████" + ANSI_BLUE + "╗"  + ANSI_GREEN + "      ██" + ANSI_BLUE + "╔"  + ANSI_GREEN + "████" + ANSI_BLUE + "╔"  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "║   "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "║  "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "█████" + ANSI_BLUE + "╗ ");
    println("             "  + ANSI_GREEN + "██" + ANSI_BLUE + "║   "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔══"  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "║╚"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔╝"  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔══╝      "  + ANSI_GREEN + "██" + ANSI_BLUE + "║╚"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔╝"  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "║   "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "║  "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "╔══╝  ");
    println("             " + ANSI_BLUE + "╚"  + ANSI_GREEN + "██████" + ANSI_BLUE + "╔╝"  + ANSI_GREEN + "██" + ANSI_BLUE + "║  "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "██" + ANSI_BLUE + "║ ╚═╝ "  + ANSI_GREEN + "██" + ANSI_BLUE + "║"  + ANSI_GREEN + "███████" + ANSI_BLUE + "╗" + ANSI_GREEN + "    ██" + ANSI_BLUE + "║ ╚═╝ "  + ANSI_GREEN + "██" + ANSI_BLUE + "║╚"  + ANSI_GREEN + "██████" + ANSI_BLUE + "╔╝"  + ANSI_GREEN + "██████" + ANSI_BLUE + "╔╝"  + ANSI_GREEN + "███████" + ANSI_BLUE + "╗");
    println("              ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝    ╚═╝     ╚═╝ ╚═════╝ ╚═════╝ ╚══════╝"+ ANSI_RESET);
   
    println("Choisissez votre difficulté : ");
    println(" 1. Simple");
    println(" 2. Normal");
    println(" 3. Difficile");
    println(" 4. Epique");
    println(" 5. Retour au menu principal\n");
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    print("> ");
    User utilisateur = creerUser(5,0);
    //génère des calculs en fonction de la difficulté choisie
    switch(readString()){
      //uniquement additions
      case "1": while(utilisateur.nbVies > 0){
        genererCalcul(grille, 1);
        for(int h=0; h<50; h++){
          println("");
        }
        if(utilisateur.nbVies==1){
          println("Il vous reste 1 vie et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }else{
          println("Il vous reste "+utilisateur.nbVies+ " vies et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }
        println("");
        if(utilisateur.nbPointsUser<=1){
          println("Vous avez "+utilisateur.nbPointsUser +" point");
        }else{
          println("Vous avez "+utilisateur.nbPointsUser + " points");
        }
        affichage(grille);
        print("> ");
        resultat = readString(temps);
        if(!equals(resultat, "") && verifier(grille, resultat)){
          utilisateur.nbPointsUser++;
          supprimerBonCalcul(grille, resultat);
        }else{
          passerLigne(grille);
        }

        if(temps >= 2000){
          temps = temps - 100;
        }

        utilisateur.nbVies=utilisateur.nbVies - derniereLigne(grille);
        
      }
      break;
      case "2": while(utilisateur.nbVies > 0){
        genererCalcul(grille, 2);
        for(int h=0; h<50; h++){
          println("");
        }
        if(utilisateur.nbVies==1){
          println("Il vous reste 1 vie et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }else{
          println("Il vous reste "+utilisateur.nbVies+ " vies et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }
        println("");
        if(utilisateur.nbPointsUser<=1){
          println("Vous avez "+utilisateur.nbPointsUser +" point");
        }else{
          println("Vous avez "+utilisateur.nbPointsUser + " points");
        }
        affichage(grille);
        print("> ");
        resultat = readString(temps);
        if(!equals(resultat, "") && verifier(grille, resultat)){
          utilisateur.nbPointsUser++;
          supprimerBonCalcul(grille, resultat);
        }else{
          passerLigne(grille);
        }

        if(temps >= 2000){
          temps = temps - 250;
        }

        utilisateur.nbVies=utilisateur.nbVies - derniereLigne(grille);
      }
      break;
      //additions, soustractions et nombres un peu plus grands
      case "3": while(utilisateur.nbVies > 0){
        genererCalcul(grille, 3);
        for(int h=0; h<50; h++){
          println("");
        }
        if(utilisateur.nbVies==1){
          println("Il vous reste 1 vie et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }else{
          println("Il vous reste "+utilisateur.nbVies+ " vies et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }
        println("");
        if(utilisateur.nbPointsUser==1){
          println("Vous avez "+utilisateur.nbPointsUser +" point");
        }else{
          println("Vous avez "+utilisateur.nbPointsUser + " points");
        }
        affichage(grille);
        print("> ");
        resultat = readString(temps);
        if(!equals(resultat, "") && verifier(grille, resultat)){
          utilisateur.nbPointsUser++;
          supprimerBonCalcul(grille, resultat);
        }else{
          passerLigne(grille);
        }

        if(temps >= 2000){
          temps = temps - 400;
        }

        utilisateur.nbVies=utilisateur.nbVies - derniereLigne(grille);
      } 
      break;
      //Ajout des multiplications. 
      case "4": while(utilisateur.nbVies > 0){
        genererCalcul(grille, 4);
        for(int h=0; h<50; h++){
          println("");
        }
        if(utilisateur.nbVies==1){
          println("Il vous reste 1 vie et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }else{
          println("Il vous reste "+utilisateur.nbVies+ " vies et vous avez " + (double)(temps)/1000 + " secondes entre chaque réponse !");
        }
        println("");
        if(utilisateur.nbPointsUser==1){
          println("Vous avez "+utilisateur.nbPointsUser +" point");
        }else{
          println("Vous avez "+utilisateur.nbPointsUser + " points");
        }
        affichage(grille);
        print("> ");
        resultat = readString(temps);
        if(!equals(resultat, "") && verifier(grille, resultat)){
          utilisateur.nbPointsUser++;
          supprimerBonCalcul(grille, resultat);
        }else{
          passerLigne(grille);
        }

        if(temps >= 2000){
          temps = temps - 600;
        }

        utilisateur.nbVies=utilisateur.nbVies - derniereLigne(grille);
      } 
      break;
      case "5": println("Retour au menu principal...");
      break;
      default: jeu();
      break;
    }
    if(utilisateur.nbVies <= 0){
      for(int z=0; z<50; z++){
        println("");
      }
      println(ANSI_RED + "  __   __   __  __  ___     __  _  _  ___  ___  ");
      println(" / _) (  ) (  \\/  )(  _)   /  \\( )( )(  _)(  ,) ");
      println("( (/\\ /__\\  )    (  ) _)  ( () )\\\\//  ) _) )  \\ ");
      println(" \\__/(_)(_)(_/\\/\\_)(___)   \\__/ (__) (___)(_)\\_)" + ANSI_RESET);
      println("");
      println("");
      println("");
      println("Vous avez perdu ! Vous avez fait un score de " + utilisateur.nbPointsUser + ", bien joué !");
      println("");
      String retourMenu = "Retour au menu principal ... ";
      for(int i = 0; i < length(retourMenu); i++){
      print(charAt(retourMenu,i));
      delay(100);
    }
    println("");
    } 
  }

  Calcul[][] initTab(){
    Calcul[][] grille = new Calcul[20][10];
    for (int i=0; i<length(grille, 1); i++){
      for(int j=0; j<length(grille, 2); j++){
        initCalc(grille, i, j);
      }
    }
    return grille;
  }
  
  void testVerifier(){
    Calcul calc = new Calcul();
    calc.operande1 = 1;
    calc.operateur = '+';
    calc.operande2 = 2;
    calc.resultat = "3";    
    Calcul[][] grille = new Calcul[][]{{calc},{calc}};
    assertFalse(verifier(grille,"4"));
    assertTrue(verifier(grille,"3"));
  }

  boolean verifier(Calcul[][] grille, String resultat){
    for(int i = 0; i < length(grille,1); i++){
      for(int j = 0; j < length(grille, 2); j++){
        if(equals(grille[i][j].resultat, resultat)){
          return true;
        }
      }
    }
    return false;
  }

  void supprimerBonCalcul(Calcul[][] grille, String resultat){
    for(int i=0; i<length(grille, 1); i++){
      for(int j=0; j<length(grille, 2); j++){
        if(equals(grille[i][j].resultat, resultat)){
          initCalc(grille, i, j);
        }
      }
    }
  }

  void testSupprimerBonCalcul(){
    Calcul calc = new Calcul();
    calc.operande1 = 1;
    calc.operateur = '+';
    calc.operande2 = 2;
    calc.resultat = "3";
    Calcul caseVide = new Calcul();
    caseVide.resultat = "";
    Calcul[][] tab = new Calcul[][]{{calc,caseVide},{caseVide,calc}};
    assertTrue(equals("3", tab[0][0].resultat));
    supprimerBonCalcul(tab,"3");
    assertFalse(equals("3", tab[0][0].resultat));
  }

  void passerLigne(Calcul[][] grille){
    for(int i=length(grille, 1)-1; i>=0; i--){
      for(int j=length(grille, 2)-1; j>=0; j--){
        if(!equals(grille[i][j].resultat,"")){
          grille[i + 1][j] = grille[i][j];
          initCalc(grille, i, j);
        }
      }
    }
  }

  void testDerniereLigne(){
    Calcul calc = new Calcul();
    calc.operande1 = 1;
    calc.operateur = '+';
    calc.operande2 = 2;
    calc.resultat = "3";
    Calcul caseVide = new Calcul();
    caseVide.resultat = "";
    Calcul[][] grille1 = new Calcul[][]{{calc,calc},{calc,caseVide}};
    assertEquals(1,derniereLigne(grille1));
    Calcul[][] grille2 = new Calcul[][]{{calc,calc},{caseVide,caseVide}};
    assertEquals(0,derniereLigne(grille2));
    Calcul[][] grille3 = new Calcul[][]{{caseVide,caseVide,caseVide},{calc,calc,caseVide}};
    assertEquals(2,derniereLigne(grille3));
  }

  int derniereLigne(Calcul[][] grille){
    int pointsPerdus = 0;
    for(int i=0; i<length(grille, 2); i++){
      if(!equals(grille[length(grille, 1)-1][i].resultat, "")){
        initCalc(grille, length(grille, 1)-1, i);
        pointsPerdus++;
      }
    }
    return pointsPerdus;
  }
  
  void initCalc(Calcul[][] grille, int i, int j){
    grille[i][j] = new Calcul();
    grille[i][j].resultat = "";
  }

  void genererCalcul(Calcul[][] grille, int difficulte){
    int min = 0;
    int max = 10;
    if(difficulte == 4){
      min = 0;
      max = 20;
    }
    int alea;
    do{
      alea = (int)(random()*10);
    }while(!equals(grille[0][alea].resultat,""));
    
    Calcul calc = new Calcul();
    calc.operande1 = ((int) (random() * max - min) + min);
    calc.operande2 = ((int) (random() * max - min) + min);
    calc.operateur = operateur(difficulte);
    if(calc.operateur == P){
      calc.resultat = (calc.operande1 + calc.operande2) + "";
    }else if(calc.operateur == M){
      calc.resultat = (calc.operande1 - calc.operande2) + "";
    }else{
      calc.resultat = (calc.operande1 * calc.operande2) + "";
    }
    grille[0][alea] = calc;
  }

  void affichage(Calcul[][] grille){
    println("");
    println("");
    println("");
    String longueur = "";
    
    for (int i=0; i<length(grille, 1); i++){
      for(int j=0; j<length(grille, 2); j++){
        longueur = ""+grille[i][j].operande1+ "" + grille[i][j].operateur+ "" + grille[i][j].operande2;
        if(i!=length(grille, 1)-1){
          print("|");
        }
        if(equals(grille[i][j].resultat, "")){
          print("       ");
        }else{
          if(length(longueur)==3){
            print("  "+grille[i][j].operande1+ "" + grille[i][j].operateur+ "" + grille[i][j].operande2 + "  ");
          }else if(length(longueur)==4){
            print("  "+grille[i][j].operande1+ "" + grille[i][j].operateur+ "" + grille[i][j].operande2 + " ");
          }else{
            print(" "+grille[i][j].operande1+ "" + grille[i][j].operateur+ "" + grille[i][j].operande2 + " ");
          }
          
        }
      }
      if(i!=length(grille, 1)-1){
        println("|");
      }
    }
    println("");
    println("");
    println("");
  }

  void testOperateur(){
    assertEquals(P,operateur(1));
    assertEquals(P,operateur(0));
  }
  //Génère un opérateur aléatoire parmi les 3 proposés au début du programme.
  char operateur(int max){
    double randomisateur = random() * max;
    char operateur;
    //randomisateur d'operateur 
    if(randomisateur < 1){
      operateur = P;
    } else if(randomisateur < 2){
      operateur = M;
    } else{
      operateur = F;
    } 
    return operateur;
  }

  void menu(){
    println("Bienvenue dans Maths Attack!");
    println("Que souhaitez vous faire? \n");
    println(" 1. Jouer");
    println(" 2. Lire les règles du jeu");
    println(" 3. Quitter le jeu");
    println(ANSI_BLACK + " 4. Jeu Secret" + ANSI_RESET);
  }

  User creerUser(int nbVies, int nbPointsUser){
    User utilisateur = new User();
    utilisateur.nbVies = nbVies;
    utilisateur.nbPointsUser = nbPointsUser;
    return utilisateur;
  } 

  void menuRegles(){
    String[] tabDesRegles = new String[]{"Vous avez décidé de regarder les règles du jeu!\n","Tout d'abord bonjour et bienvenue dans MathsAttack!\n","Le principe du jeu est le suivant:\n"," Des calculs apparaitront de plus en plus rapidement selon le nombre de point et le temps déjà acquis.\n"," Votre but est de résoudre le plus de calculs en prenant le moins de temps possible.\n"," Il y a 4 niveaux de difficulté:"," Simple,"," Normal,"," Difficile et ","Epique.\n","Comme indiqué,"," au plus la difficulté est élevée"," au plus les calculs seront complexes et le temps sera plus court.\n","Il faudra donc savoir gérer votre temps.\n","Bonne chance et bon courage!\n","Lorsque vous avez terminé de lire ces indications, tapez quelque chose dans le champ de saisie:\n"};
    for(int i = 0; i < length(tabDesRegles); i++){
      for(int j = 0; j < length(tabDesRegles[i]); j++){
        print(charAt(tabDesRegles[i],j));
        delay(100);
      }
      delay(500);
    }
    print("Champ de saisie:" + readString());
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  void menuSecret(){
    println("\n\n\n\n\n\n\n\n\n");
    println("Vous avez trouvé un Easter Egg!");
    extensions.CSVFile temp = loadCSV("CSV_Projet.csv");
    int nbPoints = 0; 
    String[] bonnesReponses = new String[12]; 
    String[] mauvaisesReponses = new String[12];
    boolean[] reponsesUser = new boolean[12];
    for(int i = 1 ; i < 13; i++){
      println("\n\n\n\n\n\n\n\n\n");
      println(ANSI_RED + "───────▄█──────────█─────────█▄───────");
      println("─────▐██──────▄█──███──█▄─────██▌─────");
      println("────▐██▀─────█████████████────▀██▌────");
      println("───▐██▌─────██████████████─────▐██▌───");
      println("───████────████████████████────████───");
      println("──▐█████──██████████████████──█████▌──");
      println("───████████████████████████████████───");
      println("────███████▀▀████████████▀▀███████────");
      println("─────█████▌──▄▄─▀████▀─▄▄──▐█████─────");
      println("───▄▄██████▄─▀▀──████──▀▀─▄██████▄▄───");
      println("──██████████████████████████████████──");
      println("─████████████████████████████████████─");
      println("▐██████──███████▀▄██▄▀███████──██████▌");
      println("▐█████────██████████████████────█████▌");
      println("▐█████─────██████▀──▀██████─────█████▌");
      println("─█████▄─────███────────███─────▄█████─");
      println("──██████─────█──────────█─────██████──");
      println("────█████────────────────────█████────");
      println("─────█████──────────────────█████─────");
      println("──────█████────────────────█████──────");
      println("───────████───▄────────▄───████───────");
      println("────────████─██────────██─████────────");
      println("────────████████─▄██▄─████████────────");
      println("───────████████████████████████───────");
      println("───────████████████████████████───────");
      println("────────▀█████████▀▀█████████▀────────");
      println("──────────▀███▀────────▀███▀──────────\n" + ANSI_RESET);
      println("Question " + i + ": " + ANSI_RED + getCell(temp, i, 0) + ANSI_RESET + "\n\nA. " + getCell(temp, i, 1) + "\nB. " + getCell(temp, i, 2) + "\nC. " + getCell(temp, i, 3) + "\nD. " + getCell(temp, i, 4));
      print("\n > ");
      String rep = readString();
      if(equals(rep,getCell(temp, i, 5))){
        nbPoints++;
        bonnesReponses[i - 1] = ANSI_GREEN + rep + ANSI_RESET;
        reponsesUser[i - 1] = true;
      } else{
        bonnesReponses[i - 1] = ANSI_RED + rep + ANSI_RESET;
      }
    }
    println("Vous avez une note de " + nbPoints + "/10!\nVoulez-vous voir vos réponses? (oui/non)");
    String ouiNon = readString();
    if(equals(ouiNon,"oui")){
      for(int i = 0; i < length(bonnesReponses); i++){
        if(reponsesUser[i]){
          println("Question " + (i + 1) + ": " + bonnesReponses[i]);
        } else{
          println("Question " + (i + 1) + ": " + bonnesReponses[i] + " --> " + ANSI_GREEN + getCell(temp, i + 1, 5) + ANSI_RESET);
        }
      }
      print("Ecrivez \"ok\" après avoir vu vos bonnes et mauvaises réponses: ");
      String stop = readString();
      while(!equals(stop,"ok")){
        print("Ecrivez \"ok\" après avoir vu vos bonnes et mauvaises réponses: ");
        stop = readString();
      }
    }
  }
}                                                                             
