def get_length(dna):
    """ (str) -> int

    Return the length of the DNA sequence dna.

    >>> get_length('ATCGAT')
    6
    >>> get_length('ATCG')
    4
    """

    num_letters = 0

    for char in dna:
        if char in 'ATCG':
            num_letters = num_letters + 1

    return num_letters

def is_longer(dna1, dna2):
    """ (str, str) -> bool

    Return True if and only if DNA sequence dna1 is longer than DNA sequence
    dna2.

    >>> is_longer('ATCG', 'AT')
    True
    >>> is_longer('ATCG', 'ATCGGA')
    False
    """

    if dna1 > dna2:
        return True
    else:
        return False

def count_nucleotides(dna, nucleotide):
    """ (str, str) -> int

    Return the number of occurrences of nucleotide in the DNA sequence dna.

    >>> count_nucleotides('ATCGGC', 'G')
    2
    >>> count_nucleotides('ATCTA', 'G')
    0
    """

    num_nucleotide = 0

    for char in dna:
        if char in nucleotide:
            num_nucleotide = num_nucleotide + 1

    return num_nucleotide

def contains_sequence(dna1, dna2):
    """ (str, str) -> bool

    Return True if and only if DNA sequence dna2 occurs in the DNA sequence
    dna1.

    >>> contains_sequence('ATCGGC', 'GG')
    True
    >>> contains_sequence('ATCGGC', 'GT')
    False

    """

    if dna2 in dna1:
        return True
    else:
        return False

def is_valid_sequence(dna):
    ''' (str) -> bool

    Return True if and only if DNA sequence includes only the
    characters 'A', 'T', 'C', 'G'.

    >>> is_valid_sequence('ATTGCCA')
    True
    >>> is_valid_sequence('ATCYUGa')
    False
    '''

    num_letters = 0

    for char in dna:
        if char not in 'ATCG':
            num_letters = num_letters + 1

    if num_letters > 0:
        return False
    else:
        return True

def insert_sequence(dna1, dna2, int):    
    ''' (str, str, int) -> str

    Return the result when the second string is inserted into
    the first at the given index.

    >>> insert_sequence('CCGG', 'AT', 2)
    'CCATGG'
    >>> insert_sequence('TACC', 'GG', 3)
    'TACGGC'
    '''

    return dna1[:int] + dna2 + dna1[int:]

def get_complement(nucleotide):
    ''' (str) -> str

    Return the complement of the given nucleotide.
    
    >>> get_complement('A')
    'T'
    >>> get_complement('C')
    'G'
    '''

    for char in nucleotide:
        if char in 'A':
            return 'T'
        if char in 'T':
            return 'A'
        if char in 'C':
            return 'G'
        if char in 'G':
            return 'C'
        else:
            return ''

def get_complementary_sequence(dna):
    ''' (str) -> str

    Return the complement of the DNA sequence given.

    >>> get_complementary_sequence('AT')
    'TA'
    >>> get_complementary_sequence('CGGAT')
    'GCCTA'
    '''

    dna_strand = ''

    for char in dna:
        if char == 'A':
            dna_strand += 'T'
        if char == 'T':
            dna_strand += 'A'
        if char == 'C':
            dna_strand += 'G'
        if char == 'G':
            dna_strand += 'C'
        
    return dna_strand
