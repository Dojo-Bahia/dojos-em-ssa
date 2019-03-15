import re

class Luhn:
  def __init__(self, number):
    #self.number = number.strip()
    self.number = number.replace(' ','')

  def is_valid(self):

    if self.has_not_number_inside():
      return False

    return len(self.number) >= 2

  def has_not_number_inside(self):
    # return False
    return not(re.search("^\d+$", self.number))

  def every_second_digit(self):
    list(reversed(list(reversed(list(self.numer)))[1:9:2]))
