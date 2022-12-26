'''A board is a list of list of str. For example, the board
    ANTT
    XSOB
is represented as the list
    [['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']]

A word list is a list of str. For example, the list of words
    ANT
    BOX
    SOB
    TO
is represented as the list
    ['ANT', 'BOX', 'SOB', 'TO']
'''


def is_valid_word(wordlist, word):
    """ (list of str, str) -> bool

    Return True if and only if word is an element of wordlist.

    >>> is_valid_word(['ANT', 'BOX', 'SOB', 'TO'], 'TO')
    True
    """

    if word in wordlist:
        return True
    else:
        return False
def make_str_from_row(board, row_index):
    """ (list of list of str, int) -> str

    Return the characters from the row of the board with index row_index
    as a single string.

    >>> make_str_from_row([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 0)
    'ANTT'
    """

    word = ''

    i = row_index
    for char in board[i]:
        word += char
    return word

def make_str_from_column(board, column_index):
    """ (list of list of str, int) -> str

    Return the characters from the column of the board with index column_index
    as a single string.

    >>> make_str_from_column([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 1)
    'NS'
    """

    word = ''
    """
    i = column_index
    for char in board:
        if char[i] == char[i]:
            word += char[i]
    return word
    """
    for row in board:
        word += row[column_index]
    return word
    
    

def board_contains_word_in_row(board, word):
    """ (list of list of str, str) -> bool

    Return True if and only if one or more of the rows of the board contains
    word.

    Precondition: board has at least one row and one column, and word is a
    valid word.

    >>> board_contains_word_in_row([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 'SOB')
    True
    """

    for row_index in range(len(board)):
        if word in make_str_from_row(board, row_index):
            return True

    return False


def board_contains_word_in_column(board, word):
    """ (list of list of str, str) -> bool

    Return True if and only if one or more of the columns of the board
    contains word.

    Precondition: board has at least one row and one column, and word is a
    valid word.

    >>> board_contains_word_in_column([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 'NO')
    False
    """
    
    for column_index in range(len(board[0])):
        if word in make_str_from_column(board, column_index):
            return True

    return False
       

def board_contains_word(board, word):
    """ (list of list of str, str) -> bool

    Return True if and only if word appears in board.

    Precondition: board has at least one row and one column.

    >>> board_contains_word([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], 'ANT')
    True
    """

    word_in_row = board_contains_word_in_row(board, word)
    word_in_col = board_contains_word_in_column(board, word)

    if word_in_row == True or word_in_col == True:
        return True
    else:
        return False




    #wordLength = 0
    
    #for row in board:
        #for w in word:
            #if w in element:
                #wordLength += 1
            #if wordLength == len(word):
               #return True

    #return False

def word_score(word):
    """ (str) -> int

    Return the point value the word earns.

    Word length: < 3: 0 points
                 3-6: 1 point per character for all characters in word
                 7-9: 2 points per character for all characters in word
                 10+: 3 points per character for all characters in word

    >>> word_score('DRUDGERY')
    16
    """

    points = len(word)

    if points < 3:
        return points * 0
    if points >= 3 and points <= 6:
        return points * 1
    if points >= 7 and points <= 9:
        return points * 2
    if points >= 10:
        return points * 3
    #return points

def update_score(player_info, word):
    """ ([str, int] list, str) -> NoneType

    player_info is a list with the player's name and score. Update player_info
    by adding the point value word earns to the player's score.

    >>> update_score(['Jonathan', 4], 'ANT')
    """
    score = word_score(word)
    player_info[1] += score
    
    
def num_words_on_board(board, words):
    """ (list of list of str, list of str) -> int

    Return how many words appear on board.

    >>> num_words_on_board([['A', 'N', 'T', 'T'], ['X', 'S', 'O', 'B']], ['ANT', 'BOX', 'SOB', 'TO'])
    3
    """

    num_words = 0
    for word in words:
        if board_contains_word_in_row(board, word):
            num_words += 1
            continue
        if board_contains_word_in_column(board, word):
            num_words += 1
    return num_words
        
def read_words(words_file):
    """ (file open for reading) -> list of str

    Return a list of all words (with newlines removed) from open file
    words_file.

    Precondition: Each line of the file contains a word in uppercase characters
    from the standard English alphabet.
    """

    word_list = []
    lines = words_file.readlines()
    
    for line in lines:
        word_list.append(line.rstrip('\n'))
    return word_list

def read_board(board_file):
    """ (file open for reading) -> list of list of str

    Return a board read from open file board_file. The board file will contain
    one row of the board per line. Newlines are not included in the board.
    """

    board = []
    lines = board_file.readlines()

    for line in lines:
        row_list = []
        #row_list.append(line.rstrip('\n'))
        for letter in line.rstrip('\n'):
            row_list.append(letter)
        board.append(row_list)
    return board
