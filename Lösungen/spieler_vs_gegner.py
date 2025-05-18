class Spieler:
    def __init__(self, name, lebenspunkte, schadenspunkte):
        self.__name = name
        self.lebenspunkte = lebenspunkte
        self.schadenspunkte = schadenspunkte

    def angreifen(self, gegner):
        print(f"{self.__name} greift {gegner.name} an und verursacht {self.schadenspunkte} Schaden.")
        gegner.lebenspunkte -= self.schadenspunkte
        print(f"{gegner.name} hat noch {gegner.lebenspunkte} Lebenspunkte.")

    def heilen(self):
        heilung = 10
        self.lebenspunkte += heilung
        print(f"{self.__name} heilt sich um {heilung} Punkte. Neue Lebenspunkte: {self.lebenspunkte}")
        
    def get_name(self):
        return self.__name


class Gegner:
    def __init__(self, name, lebenspunkte, schadenspunkte):
        self.name = name
        self.lebenspunkte = lebenspunkte
        self.schadenspunkte = schadenspunkte

    def angreifen(self, spieler):
        print(f"{self.name} greift {spieler.get_name()} an und verursacht {self.schadenspunkte} Schaden.")
        spieler.lebenspunkte -= self.schadenspunkte
        print(f"{spieler.get_name()} hat noch {spieler.lebenspunkte} Lebenspunkte.")


# Beispiel-Szenario
spieler = Spieler("Alex", 100, 15)
gegner = Gegner("Zombie", 50, 8)

gegner.angreifen(spieler)
spieler.heilen()
spieler.angreifen(gegner)
spieler.angreifen(gegner)
spieler.angreifen(gegner)

print(spieler.get_name())