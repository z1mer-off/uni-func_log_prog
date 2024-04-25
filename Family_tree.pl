man(voeneg).
man(voe).
man(ratibor).
man(boguslav).
man(velerad).
man(duhovlad).
man(svyatoslav).
man(dobrozhir).
man(bogomil).
man(zlatomir).

woman(goluba).
woman(lubomila).
woman(bratislava).
woman(veslava).
woman(zhdana).
woman(bozhedara).
woman(broneslava).
woman(veselina).
woman(zdislava).
woman(grand_goluba).
woman(grand_voen).

parent(grand_voen,voeneg).
parent(grand_goluba,goluba).

parent(voeneg,ratibor).
parent(voeneg,bratislava).
parent(voeneg,velerad).
parent(voeneg,zhdana).

parent(goluba,ratibor).
parent(goluba,bratislava).
parent(goluba,velerad).
parent(goluba,zhdana).

parent(ratibor,svyatoslav).
parent(ratibor,dobrozhir).
parent(lubomila,svyatoslav).
parent(lubomila,dobrozhir).

parent(boguslav,bogomil).
parent(boguslav,bozhedara).
parent(bratislava,bogomil).
parent(bratislava,bozhedara).

parent(velerad,broneslava).
parent(velerad,veselina).
parent(veslava,broneslava).
parent(veslava,veselina).

parent(duhovlad,zdislava).
parent(duhovlad,zlatomir).
parent(zhdana,zdislava).
parent(zhdana,zlatomir).


%Task 1

/*
men prints all man
*/
men():-man(X), print(X), nl, fail.
/*
women prints all woman
*/
women():-woman(X), print(X), nl, fail.
/*
children(+X) is failure
Print all childrens of X
*/
children(X):- parent(X,Y), print(Y), nl, fail.

/*
mother(?X,?Y) is det
True, if X is mother of Y
If X or Y missing, find X or Y
*/
mother(X,Y):- woman(X), parent(X,Y).

/*
mother(X) is failure
print mother of X
*/
mother(X):-mother(Y,X),print(Y),nl,fail.

/*
brother(?X,?Y) is det
True, if X is brother of Y
If X or Y missing, find X or Y
*/
brother(X,Y):- man(X), parent(Z,X), parent(Z, Y), man(Z),X\=Z.

/*
brother(+X) is failure
Print all brothers of X
*/
brother(X):- parent(Z,X), man(Z), parent(Z, Y), man(Y), X\=Y, print(Y), nl, fail.

/*
b_s(?X,?Y) is det
True, if X is brother of sister Y
If X or Y missing, find X or Y
*/
b_s(X,Y):- man(X), woman(Y), parent(Z,X), parent(Z, Y), man(Z).

/*
b_s(+X) is failure
Print all sisters of brother X
*/
b_s(X):- b_s(X, Y), X\=Y, print(Y), nl, fail.

/*
son(?X,?Y) is det
True, if X is son of Y
If X or Y missing, find X or Y
*/
son(X,Y):-parent(Y,X),man(X).
/*
son(+X) is failure
Print all sons of X
*/
son(X):-son(Y,X), print(Y), nl, fail.
/*
husband(?X,?Y) is det
True, if X is husband of Y
If X or Y missing, find X or Y
*/
husband(X,Y):-man(X),woman(Y),parent(X,Z),parent(Y,Z).
/*
husband(+X) is failure
Print husband of X
*/
husband(X):-husband(Y,X), print(Y), nl,!, fail.
