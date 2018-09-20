Simulationcraft or Simc is a way to simulate your toon from the game World of Warcraft. Data is extracted from the game through a text format, commonly described as a simc string

An example simc string:

```
# SimC Addon 1.10.6
# 8.0 Note: reforge= is being used as a hacky way to capture item context. This will be changed in 8.1
warrior="Danragh"
level=120
race=orc
region=eu
server=ragnaros
role=attack
professions=alchemy=150/herbalism=150
talents=3313211
spec=arms
head=,id=159422,bonus_id=4819/1512/4786,reforge=23,azerite_powers=226/30/476
neck=,id=158075,bonus_id=4936/4929/4930/1512,reforge=11,azerite_level=21
shoulder=,id=161460,bonus_id=5120/1492/4786,reforge=3,azerite_powers=433/22
back=,id=159287,bonus_id=5009/1527/4786,reforge=16
chest=,id=160636,bonus_id=4823/1492/4786,reforge=5,azerite_powers=435/31
wrist=,id=159441,gem_id=153707,bonus_id=5008/4802/1537/4786,reforge=16
hands=,id=155890,bonus_id=5008/1537/4786,reforge=16
waist=,id=159418,bonus_id=5007/1532/4786,reforge=16
legs=,id=161648,bonus_id=5071/5128/1562/4786,reforge=56
feet=,id=160640,bonus_id=4799/1497/4783,reforge=5
finger1=,id=161671,enchant_id=5939,bonus_id=4986/5129/1562/4783,reforge=39
finger2=,id=162865,enchant_id=5939,bonus_id=1562/4784,reforge=47
trinket1=,id=160650,bonus_id=4799/1497/4783,reforge=5
trinket2=,id=159125,reforge=13
main_hand=,id=160679,enchant_id=5963,bonus_id=4800/1507/4786,reforge=6
```

This program loads in the Simc String and manipulates it to ease the burden of adding multiple simulations in one.