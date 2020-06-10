# Втора лабораториска вежба по Софтверско инженерство
# Симона Милошеска, бр. на индекс 186030
## Група на код:

Ја добив групата на код 3
## Control Flow Graph

Фотографија од control flow graph-ot
## Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата E-N+2, каде што E е бројот на ребра(E=33), а N е број на јазли(N=25).

## Тест случаи според критериумот Multiple condition
     if (!digit || !upper || !special)
   
     -> T||X||X
      user={username="anam",password="Akijuhjkijrf.",email="ana@gmail.com"}
     -> F||T||X
      user={username="anam",password="12mskk".",email="ana@gmail.com"}
     -> F||F||T
      user={username="anam",password="sIM123".",email="ana@gmail.com"}
     -> F||F||F
      user={username="anam",password="siM?123.M".",email="ana@gmail.com"}
     
     if (user.getUsername()==null || user.getPassword()==null)
    
      ->T||X
       user={username=null,password="536782njwh3",email="ana@gmail.com"}
      ->F||T
       user={username="simom",password=null,email="ana@gmail.com"}
      ->F||F
       user={username="anam",password="12asmkM.ive?",email="ana@gmail.com"}
 
## Тест случаи според критериумот Every path

     -> 1,2, 3, 4, 26
        user=null
     
     -> 1,2, 3, 5, 6, 26
      user={username = null, password = biloshto, email=simona.milosheska@yahoo.com} , [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 10, 26
      user={username=anam, password=12anam?, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 12, 26
      user={username=anam, password=12a, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=12Aiisim34, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 22, 15.3, 15.2), 23, 25, 26
      ne e mozhno
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 25, 26
      user={username=anam, password=12asmkM.ive?, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 24, 26
      Ne e mozhno da vrati false(site tri uslovi se ispolneti)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 21, 22, 15.3, 15.2), 23, 25, 26
      Ne e mozhno da ne sodrzhi golema bukva a da vrati true(25)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 21, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=12mskoajd!je, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 22, 15.3, 15.2), 23, 25, 26
      Ne e mozhno lozinkata da ne sodrzhi brojka i da vrati true(25)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=126369752, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 25, 26
      Ne e mozhno lozinkata da ne sodrzhi brojka i da vrati true(25)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=Mm?skoajd!je, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 22, 15.3, 15.2), 23, 25, 26
      Ne e mozhe lozinkata da sodrzhi samo golema bukva i da vrati true(25)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=MMMMAAAA, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 21, 22, 15.3, 15.2), 23, 25, 26
      Ne mozhe lozinkata da sodrzhi samo znak i da vrati true(25)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 21, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=%^mskoaj.!e, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 22, 15.3, 15.2), 23, 25, 26
      Ne mozhe da nema nitu eden ispolnet uslov i da vrati true(25)
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 22, 15.3, 15.2), 23, 24, 26
      user={username=anam, password=mkojmskoajdl, email=ana.m@gmail.com}, [simonam, anam, bojanb]
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, 23, 24, 26
      ne e vozmozhno
     
     -> 1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, 23, 25, 26
      ne e vozmozhno
      



