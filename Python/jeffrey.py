from mnemonic import Mnemonic
import itertools

mnemo = Mnemonic("english")

phrase = "nature midnight buzz toe sleep fence kiwi ivory excuse system" # guess the final two

# get words into a list
list_of_words = []
with open('english.txt','r') as file:
	for line in file:
		list_of_words.append(line.strip())
#print(list_of_words)

# i = 0
for words in itertools.combinations_with_replacement(list_of_words, 2):
	# print(i)
	# i+=1
	new = phrase
	for word in words:
		new = new + " " + word
	# print(new)
	seed = mnemo.to_seed(new, passphrase="")
	# print(seed.hex())
	# print(seed.hex()[0:30])
	if seed.hex()[0:30] == '131c553f7fb4127e7b2b346991dd92':
		print(seed.hex())
		print(new)

# seed = mnemo.to_seed(phrase, passphrase="")
# print(seed.hex())