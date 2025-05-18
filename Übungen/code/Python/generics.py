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
        self.elemente.append(element)

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


# Aufgabe 2:
# Hole das zweite Element aus dem Container und gib es aus.


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


# Aufgabe 4:
# Versuche, einen Container mit einem Nicht-Animal-Typ zu erstellen (z.B. int) und beobachte den Typfehler.


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


# Aufgabe 6:
# Schreibe eine generische Klasse "Paar", die zwei Elemente gleichen Typs speichert und deren Werte summieren kann,
# falls der Typ die Addition unterstützt (z.B. int, float).

# Hinweis: Hierfür kann man eine Typbeschränkung auf z.B. Number in späteren Python-Versionen verwenden,
# oder die Addition einfach voraussetzen und mit duck typing arbeiten.
