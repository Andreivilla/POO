str = """p u b l i c s t a t i c PessoaDAO g e t I n s t a n c e ( ) t h r o w s Cl a s sN o t F o u n dE x c e p ti o n , SQLExcep tion ,
S e l e c t E x c e p t i o n {
i f ( i n s t a n c e == n u l l ) {
i n s t a n c e = new PessoaDAO ( ) ;
}
r e t u r n i n s t a n c e ;
}"""

str = str.replace(" ", "")
str = str.replace("’", "'")

print(str)