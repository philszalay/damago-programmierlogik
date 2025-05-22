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