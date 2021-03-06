from packages.Package import *
from enums.PackageType import *


class Box(Package):
    package_type = PackageType.BOX
    length = 0
    height = 0
    width = 0


    def __init__(self, price, producer, material,volume, lenght, height, width):
        self._price = price;
        self._producer = producer;
        self.material = material
        self.volume = volume
        self.length = lenght
        self.height = height
        self.width = width


    def __str__(self):
        return "Type of package:"+ str(self.package_type) +"    Price: " + str(self._price) + "  Producer: " + str(
            self._producer) + " Material: " + self.material + " Volume: " + str(self.volume)+" Size: " + str(self.length)+" x "+ str(self.height)+" x "+ str(self.width)
