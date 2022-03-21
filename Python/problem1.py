from mnemonic import Mnemonic
from tqdm import tqdm
import unicodedata

mnemo = Mnemonic("english")
seedStart = "131c553f7fb4127e7b2b346991dd92"
for i in tqdm(range(len(mnemo.wordlist))):
    for j in mnemo.wordlist:
        words = "nature midnight buzz toe sleep fence kiwi ivory excuse system {0} {1}".format(mnemo.wordlist[i],j)
        seed = mnemo.to_seed(words, passphrase="")
        seed = str(seed).split('\\x')
        seed = "".join(seed)
        if seed[0:30]==seedStart:
            print(mnemo.wordlist[i],j)
            break

