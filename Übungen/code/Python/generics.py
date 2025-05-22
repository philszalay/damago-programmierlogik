class Charakter:
    def __init__(self, name, lebenspunkte, schadenspunkte):
        self.__name = name
        self.lebenspunkte = lebenspunkte
        self.schadenspunkte = schadenspunkte
 
    def schreien(self, text):
        print("SCHREI von: ", self.__name, ":", text)
 
    def angreifen(self, objekt_vom_typ_charakter):
        print("Dieser Typ wird angegriffen: ", type(objekt_vom_typ_charakter))
 
        print(f"{self.__name} greift {objekt_vom_typ_charakter.get_name()} an und verursacht {self.schadenspunkte} Schaden.")
 
        objekt_vom_typ_charakter.lebenspunkte -= self.schadenspunkte
 
        if objekt_vom_typ_charakter.lebenspunkte < 0:
            objekt_vom_typ_charakter.lebenspunkte = 0
 
        print(f"{objekt_vom_typ_charakter.get_name()} hat noch {objekt_vom_typ_charakter.lebenspunkte} Lebenspunkte.")
 
    def get_name(self):
        return self.__name
   
 
class Spieler(Charakter):
    def __init__(self, name, lebenspunkte, schadenspunkte):
        super().__init__(name, lebenspunkte, schadenspunkte)
 
    def heilen(self):
        self.lebenspunkte += 10
 
        # Check, dass Lebenspunkte nicht größer als 100 sind
        if self.lebenspunkte > 100:
            self.lebenspunkte = 100
 
        print(f"{self.get_name()} heilt sich um 10 Punkte. Neue Lebenspunkte: {self.lebenspunkte}")
 
 
class Gegner(Charakter):
    def __init__(self, name, lebenspunkte, schadenspunkte):
        super().__init__(name, lebenspunkte, schadenspunkte)
 
 
# Beispiel-Szenario
spieler = Spieler("Alex", 100, 15)
gegner = Gegner("Zombie", 50, 8)
 
gegner_hans = Gegner("Hans", 50, 1)
 
gegner.angreifen(spieler)
spieler.heilen()
spieler.angreifen(gegner)
spieler.angreifen(gegner)
spieler.angreifen(gegner)
 
spieler.angreifen(gegner_hans)
 
spieler.angreifen(gegner)
 
gegner.angreifen(spieler)
 
gegner.schreien("Hiiilfe")
 
spieler.schreien("Renn!!")
 
from typing import TypeVar, Generic, List
 
# Neue Typvariable T für generische Klassen
T = TypeVar('T')
 
class Container(Generic[T]):
    """
    Ein einfacher Container, der beliebige Elemente speichern kann.
    """
    def __init__(self) -> None:
        self.elemente: List[T] = []
 
    def hinzufuegen(self, element: T) -> None:
        """
        Fügt ein Element hinzu.
        """
        self.elemente.insert(0, element)
 
    def holen(self, index: int) -> T:
        """
        Holt ein Element nach Index.
        """
        return self.elemente[index]
 
    def groesse(self) -> int:
        """
        Gibt die Anzahl der Elemente zurück.
        """
        return len(self.elemente)
 
 
# Aufgabe 1:
# Erstelle einen Container für Ganzzahlen, füge mehrere Zahlen hinzu und gib die Anzahl aus.
phils_container = Container[int]()
phils_container.hinzufuegen(123)
phils_container.hinzufuegen(56)
phils_container.hinzufuegen(1)
phils_container.hinzufuegen(99)
phils_container.hinzufuegen(5445)
phils_container.hinzufuegen(5445)
 
print(phils_container.groesse())
 
 
# Aufgabe 2:
# Hole das zweite Element aus dem Container und gib es aus.
print(phils_container.holen(1))
 
# Typbeschränkung: Nur Klassen, die von Basisklasse Animal erben
 
class Animal:
    def sprich(self) -> str:
        return "..."
 
# Neue Typvariable, die nur Unterklassen von Animal erlaubt
A = TypeVar('A', bound=Animal)
 
class Zoo(Generic[A]):
    """
    Zoo speichert Tiere, die von Animal erben.
    """
    def __init__(self) -> None:
        self.tiere: List[A] = []
 
    def neues_tier(self, tier: A) -> None:
        self.tiere.append(tier)
 
    def alle_stimmen(self) -> List[str]:
        """
        Gibt eine Liste aller Tiergeräusche zurück.
        """
        return [tier.sprich() for tier in self.tiere]
 
 
# Beispiel-Unterklassen von Animal
 
class Hund(Animal):
    def sprich(self) -> str:
        return "Wuff!"
 
class Katze(Animal):
    def sprich(self) -> str:
        return "Miau!"
 
# Aufgabe 3:
# Erstelle einen Zoo, füge Hunde und Katzen hinzu und gib alle Tierstimmen aus.
mein_zoo = Zoo[Animal]()
 
mein_hund = Hund()
mein_zoo.neues_tier(mein_hund)
 
meine_katze = Katze()
mein_zoo.neues_tier(meine_katze)
 
mein_zoo.neues_tier(mein_hund)
mein_zoo.neues_tier(mein_hund)
 
print(mein_zoo.alle_stimmen())
 
 
# Aufgabe 4:
# Versuche, einen Container mit einem Nicht-Animal-Typ zu erstellen (z.B. int) und beobachte den Typfehler.
#zoo = Zoo[int]()
 
#zoo.neues_tier(1)
 
#zoo.alle_stimmen()
 
# Generische Funktion mit zwei Parametern verschiedener Typen
 
U = TypeVar('U')
V = TypeVar('V')
 
def tausche(a: U, b: V) -> tuple[V, U]:
    """
    Tauscht zwei Werte und gibt sie als Tupel zurück.
    """
    return (b, a)
 
# Aufgabe 5:
# Teste die Funktion tausche mit verschiedenen Typen.
print(tausche("Hallo", "Wie gehts"))
print(tausche(1,2))
print((mein_hund.sprich(), meine_katze.sprich()))
 
# Aufgabe 6:
# Schreibe eine generische Klasse "Paar", die zwei Elemente gleichen Typs speichert und deren Werte summieren kann,
# falls der Typ die Addition unterstützt (z.B. int, float).
 
Z = TypeVar('Z')
 
class Paar(Generic[Z]):
    def __init__(self):
        self.tuple = None
   
    def set_tuple(self, a: T, b: T):
        self.tuple = (a, b)
 
    def get_summe_von_tupel(self) -> T:
        return sum(self.tuple)
 
 
mein_paar = Paar[int]()
 
mein_paar.set_tuple(5, 7)
 
print(mein_paar.get_summe_von_tupel())
 
 
# Hinweis: Hierfür kann man eine Typbeschränkung auf z.B. Number in späteren Python-Versionen verwenden,
# oder die Addition einfach voraussetzen und mit duck typing arbeiten.
