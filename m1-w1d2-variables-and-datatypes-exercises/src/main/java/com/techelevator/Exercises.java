package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */ 
		int birdsOnABranch = 4 ;
        int birdsFlewAway = 1;
        int totalNumberOfBirds = birdsOnABranch - birdsFlewAway;
        System.out.println("Total Number of birds is equal to: " +totalNumberOfBirds);
		
        
        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
        int birds = 6;
        int nests = 3;
        int birdsAndNests = birds - nests;
        System.out.println("There are this many more birds than nests is equal to: " + birdsAndNests);


        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
        int racoonsPlaying = 3;
        int racoonsGoingHome = 2;
        int racoonsLeftInWoods = racoonsPlaying - racoonsGoingHome;
        System.out.println("There are \"" + racoonsLeftInWoods + "\" racoons left in the woods.");   

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
        int flowers = 5;
        int bees = 3;
        int beesLessThanFlowers = flowers - bees;
        System.out.println("There are \"" + beesLessThanFlowers +"\" less bees than flowers");
        
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
        int lonelyPigeon = 1;
        int anotherPigeon = 1;
        int totalNumberOfPigeons = lonelyPigeon + anotherPigeon;
        System.out.println("There are now \"" + totalNumberOfPigeons +"\" pigeons eating breadcrumbs");
        
        

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
        int owlsOnFence = 3;
        int arrivingOwls = 2;
        int totalNumberOfOwls = owlsOnFence + arrivingOwls;
        System.out.println("There are now this many owls on the fence: " + totalNumberOfOwls);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
        int beaversWorkingOnHome = 2;
        int beaversGoingForASwim = 1;
        int beaversNumber = beaversWorkingOnHome - beaversGoingForASwim;
        System.out.println(" There are this many beavers working on their home " + beaversNumber);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
        int toucansOnTree = 2;
        int joiningToucan = 1;
        int totalToucanNumber = toucansOnTree + joiningToucan;
        System.out.println("There are \""  + totalToucanNumber +"\" toucans in all");

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
        int numberOfSquirrels = 4;
        int numberOfNuts = 2;
        int squirrelsVsNuts = numberOfSquirrels - numberOfNuts;
        System.out.println("There are \"" + squirrelsVsNuts + "\" more squirrels than there are nuts ");

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
        int dime = 10;
        int quarter = 25;
        int twoNickels = 10;
        int amountOfMoneyFound = dime + quarter + twoNickels;
        System.out.println("Mr.s Hilt found \"" + amountOfMoneyFound + "\" cents");

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
        int mrsBriersClass = 18;
        int mrsMacadamsClass = 20;
        int mrsFlanerysClass = 17;
        int totalMuffinCount = mrsBriersClass + mrsMacadamsClass + mrsFlanerysClass;
        System.out.println("The first grade class baked \"" + totalMuffinCount + "\" muffins overall");
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyo = 24;
        int whistle = 14;
        int totalPrice = yoyo + whistle;
        System.out.println("Mrs. Hilt spent a total of \"" + totalPrice + "\" cents on the two toys");
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int miniMallows = 10;
        int largeMallows = 8;
        int totalMallows = miniMallows + largeMallows;
        System.out.println("Mrs. Hilt used \"" + totalMallows + "\" ");
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int house = 29;
        int school = 17;
        int snowfall = school - house;
        System.out.println("Mrs. Hilts house had \"" + snowfall + "\" more inches of snow ");
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
         */
        int money = 10;
        int truck = 3;
        int pencil = 2;
        int totalLeftOver = money - truck -pencil;
        System.out.println("Mrs. Hilt has $ \"" + totalLeftOver + " left over ");
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int marbles = 16;
        int marblesLost = 7;
        int totalMarbles = marbles - marblesLost;
        System.out.println("Josh now has \"" + totalMarbles + "\" left over ");
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */int currentNumber = 19;
          int numberNeeded  = 6;
          int fullCollection = currentNumber + numberNeeded;
          System.out.println("Megan needs to find \"" + fullCollection + "\" more seashells to have 25");
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
          int redBalloons = 8;
          int setOfBalloons = 17;
          int numberOfGreenBalloons = setOfBalloons - redBalloons;
          System.out.print("Brad has \"" + numberOfGreenBalloons + "\" ");
            
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
          int booksOnShelf = 38;
          int booksPutBackOnShelf = 10;
          int totalBookNumber = booksOnShelf + booksPutBackOnShelf;
          System.out.print("There are now \"" + totalBookNumber + "\" books on the shelf ");
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
            
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
            
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
            
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
            
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
            
	}

}
