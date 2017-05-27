public class Dungeon extends Roll
{
    // Dungeon Master's Guide pg 292

    public void DeathTrap(int result)
    {
        if (result == 0)
        {
            System.out.println("Antechamber or waiting room for spectators.");
        }
        else if (result == 1 || result <= 7)
        {
            System.out.println("Guardroom fortified against intruders.");
        }
        else if (result == 8 || result <= 10)
        {
            System.out.println("Vault for holding important treasures, accessible only by locked or secret door (75 percent chance of being trapped).");
        }
        else if (result == 11 || result <= 13)
        {
            System.out.println("Room containing a puzzle that must be solved to bypass a trap or monster.");
        }
        else if (result == 14 || result <= 18)
        {
            System.out.println("Trap designed to kill or capture creatures.");
        }
        else if (result == 19)
        {
            System.out.println("Observation room, allowing guards or spectators observe creatures moving through the dungeon.");
        }
        else
        {
            System.out.println("Error: Death Trap. Empty Roll.");
        }
    }

    public void Purpose(int result)
    {
        if (result == 0)
        {
            System.out.println("Armory stocked with weapons and armor.");
        }
        else if (result == 1)
        {
            System.out.println("Audience charmber, used to receive guests.");
        }
        else if (result == 2)
        {
            System.out.println("Banquet room for important celebrations.");
        }
        else if (result == 3)
        {
            System.out.println("Barracks where the lair's defenders are quartered.");
        }
        else if (result == 4)
        {
            System.out.println("Bedroom, for use by leaders.");
        }
        else if (result == 5)
        {
            System.out.println("Chapel where the lair's inhabitants worship.");
        }
        else if (result == 6)
        {
            System.out.println("Cistern or well for drinking water.");
        }
        else if (result == 7 || result == 8)
        {
            System.out.println("Guardoom for the defense of the lair");
        }
        else if (result == 9)
        {
            System.out.println("Kennel for pets or guard beasts.");
        }
        else if (result == 10)
        {
            System.out.println("Kitchen for food storage and preparation.");
        }
        else if (result == 11)
        {
            System.out.println("Pen or prison where captives are held.");
        }
        else if (result == 12 || result == 13)
        {
            System.out.println("Storage, mostly nonperishable goods.");
        }
        else if (result == 14)
        {
            System.out.println("Throne room where the lair's leaders hold court.");
        }
        else if (result == 15)
        {
            System.out.println("Torture chamber.");
        }
        else if (result == 16)
        {
            System.out.println("Training and exercise room.");
        }
        else if (result == 17)
        {
            System.out.println("Trophy room or museum.");
        }
        else if (result == 18)
        {
            System.out.println("Latrine or bath.");
        }
        else if (result == 19)
        {
            System.out.println("Workshop for the construction of weapons, armor, tools and other goods.");
        }
        else
        {
            System.out.println("Error: Purpose. Empty roll.");
        }
    }

    public void Maze(int result)
    {
        if (result == 0)
        {
            System.out.println("Conjuring room, used to summon creatures that guard the maze.");
        }
        else if (result == 1 || result <= 4)
        {
            System.out.println("Guardroom for sentinels that patrol the maze.");
        }
        else if (result == 5 || result <= 9)
        {
            System.out.println("Workshop for the construction of weapons, armor, tools and other goods.");
        }
        else if (result == 10)
        {
            System.out.println("Pen or prison accessible only by secret door, used to hold captives condemned to the maze.");
        }
        else if (result == 11)
        {
            System.out.println("Shrine dedicated to a god or other entity.");
        }
        else if (result == 12 || result == 13)
        {
            System.out.println("Storage for food, as well as tools used by the maze's guardians to keep the complex in order.");
        }
        else if (result == 14 || result == 17)
        {
            System.out.println("Trap to confound or kill those sent into the maze.");
        }
        else if (result == 18)
        {
            System.out.println("Well that provides drinking water.");
        }
        else if (result == 19)
        {
            System.out.println("Error: Maze. Empty roll.");
        }
    }

    public void Mine(int result)
    {
        if (result == 0 || result == 1)
        {
            System.out.println("Barracks for miners.");
        }
        else if (result == 2)
        {
            System.out.println("Bedroom for a supervisor or manager.");
        }
        else if (result == 3)
        {
            System.out.println("chapel dedicated to a patron deity of miners, earth, or protection.");
        }
        else if (result == 4)
        {
            System.out.println("Cistern providing drinking water for miners.");
        }
        else if (result == 5 || result == 6)
        {
            System.out.println("Guardroom.");
        }
        else if (result == 7)
        {
            System.out.println("Kitchen used to feed workers.");
        }
        else if (result == 8)
        {
            System.out.println("Laboratory used to conduct tests on strange minerals extracted from the mine.");
        }
        else if (result == 9 || result <= 14)
        {
            System.out.println("Lode where metal ore is mined (75 percent chance of being depleted).");
        }
        else if (result == 15)
        {
            System.out.println("Office used by the mine supervisor.");
        }
        else if (result == 16)
        {
            System.out.println("Smithy for repairing damaged tools.");
        }
        else if (result == 17 || result == 18)
        {
            System.out.println("Storage for tools and other equipment.");
        }
        else if (result == 19)
        {
            System.out.println("Strong room or vault used to store ore for transport to the surface.");
        }
        else
        {
            System.out.println("Error: Mine. Empty roll.");
        }
    }

    public void PlanarGate(int result)
    {
        if (result == 0 || result <= 2)
        {
            System.out.println("Decorated foyer or antechamber.");
        }
        else if (result == 3 || result <= 7)
        {
            System.out.println("Armory used by the portal's guardians.");
        }
        else if (result == 8 || result == 9)
        {
            System.out.println("Audience chamber for receiving visitors.");
        }
        else if (result == 10 || result <= 18)
        {
            System.out.println("Barracks used by the portal's guard.");
        }
        else if (result == 19 || result <= 22)
        {
            System.out.println("Bedroom for use by the high-ranking members of the order that guards the portal.");
        }
        else if (result == 23 || result <= 29)
        {
            System.out.println("Chapel dedicated to a deity or deities related to the portal and its defenders.");
        }
        else if (result == 30 || result <= 34)
        {
            System.out.println("Cistern providing fresh water.");
        }
        else if (result == 35 || result <= 37)
        {
            System.out.println("Classroom for use of tinitiates learning about the portal's secrets.");
        }
        else if (result == 38)
        {
            System.out.println("Conjuring room for summoning creatures used to investigate or defend the portal.");
        }
        else if (result == 39 || result == 40)
        {
            System.out.println("Crypt where the remains of the remains of those that died guarding the portal are kept.");
        }
        else if (result == 41 || result <= 46)
        {
            System.out.println("Dining room");
        }
        else if (result == 47 || result <= 49)
        {
            System.out.println("Divination room used to investigate the portal and events tied to it.");
        }
        else if (result == 50 || result <= 54)
        {
            System.out.println("Dormitory for visitors and guards.");
        }
        else if (result == 55 || result == 56)
        {
            System.out.println("Entry room.");
        }
        else if (result == 57 || result == 58)
        {
            System.out.println("Gallery for displaying trophies and objects related to the portal and those that guard it.");
        }
        else if (result == 59 || result <= 66)
        {
            System.out.println("Guardroom to protect or watch over the portal.");
        }
        else if (result == 67 || result <= 71)
        {
            System.out.println("Kitchen.");
        }
        else if (result == 72 || result <= 76)
        {
            System.out.println("Laboratory for conducting experiments relating to the portal and creatures that emerge from it.");
        }
        else if (result == 77 || result <= 79)
        {
            System.out.println("Library holding books about the portal's history.");
        }
        else if (result == 80 || result == 84)
        {
            System.out.println("Pen or prison for holding captives or creatures that emerge from the portal.");
        }
        else if (result == 85 || result == 86)
        {
            System.out.println("Planar junction, where the gate to another plane once stood (25 percent chance of being active).");
        }
        else if (result == 87 || result <= 89)
        {
            System.out.println("Storage.");
        }
        else if (result == 90)
        {
            System.out.println("Strong room or vault, for guarding valuable treasures connected to the portal or funds used to pay the planar gate's guardians.");
        }
        else if (result == 91 || result == 92)
        {
            System.out.println("Study.");
        }
        else if (result == 93)
        {
            System.out.println("Torture chamber, for questioning creatures that pass through the portal or that attempt to clandestinely use it.");
        }
        else if (result == 94 || result <= 97)
        {
            System.out.println("Latrine or bath.");
        }
        else if (result == 98 || result == 99)
        {
            System.out.println("Workshop for constructing tools and gear needed to study the portal.");
        }
        else
        {
            System.out.println("Error: Planar Gate. Empty roll.");
        }
    }
}
