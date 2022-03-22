# MultiThreatening Dining Philosophers Problem

This algorithm solves dining philosophers problem using multithreatening.
[See this in action!](https://www.youtube.com/watch?v=vHdBs39LQ6g)

## Here you have the explanation:

[PL]
Problem polega na zsynchronizowaniu działań pięciu chińskich filozofów, którzy mieszkają w położonej na
odludziu chacie (według innych przekazów była to wieża z kości słoniowej), mieszczącej jadalnię i salę do
medytacji. Żyją oni, starając się zachować równowagę między yang i yin, Niebem i Ziemią, duchem i ciałem.
Filozofowie są na tyle zaawansowani w ascezie, że nie muszą spać ani wykonywać innych przyziemnych
czynności (rzecz dzieje się u kresu dziesięciu mitycznych epok, prawdopodobnie w czasie panowania Żółtego
Cesarza Huang–ti, kiedy to wiele rzeczy było możliwych, jak o tym świadczą zachowane legendy). Czas upływa
im na myśleniu i medytacji w przeznaczonej do tego sali, muszą jednak od czasu do czasu jeść (zgodnie z
klasyczną zasadą zachowania równowagi yin–yang). W jadalni stoi okrągły stół z pięcioma miseczkami, między
którymi leży pięć pałeczek do ryżu, a na środku stołu znajduje się duża misa z niewyczerpalnym zapasem
gotowanego ryżu - swego rodzaju róg (chińskiej) Amaltei . Etykieta mówi, że każdy filozof siada zawsze na tej
samej poduszce, je zawsze ze swojej miseczki i może korzystać tylko z pałeczek znajdujących się po obu jej
stronach. Filozofowie przestrzegają ustalonej etykiety jak prawdziwi konfucjaniści, na przykład nigdy nie
sięgnęliby po ryż dłonią. Nie urządzają jednak żadnych zebrań, nie uznają hierarchii, nie posiadają żadnej
informacji, dotyczącej spraw przyziemnych. Kiedy poczują głód to spontanicznie ruszają do jadalni.
Jak powinni oni odprawiać swój rytuał, aby nie umrzeć z głodu? Rozwiązanie powinno spełniać następujące
warunki:
1. Filozof je tylko wtedy, gdy ma dwie pałeczki.
2. Dwóch filozofów nie może jednocześnie trzymać tej samej pałeczki.
3. Nie występuje blokada (sytuacja patowa). Może ona wystąpić np. wtedy, gdy wszyscy filozofowie podniosą
lewe pałeczki i będą czekać na zwolnienie prawych.
4. Nikt nie może być zagłodzony. Oczywista z pozoru strategia, polegająca na poczekaniu, aż obie pałeczki
będą wolne, może spowodować zagłodzenie dwóch filozofów (dlaczego?).
5. Żaden z filozofów nie zajmuje się tylko jedzeniem. Po zakończeniu posiłku każdy odkłada pałeczki i wraca
do sali medytacji.
6. Filozofowie podnoszą i odkładają pałeczki po jednej naraz.
7. Nie można wyróżniać żadnego z filozofów (algorytmy ich działania powinny być takie same).
Jedno z rozwiązań wymaga zaangażowanie odźwiernego, pilnującego drzwi jadalni i pozwalającego przebywać
w niej jednocześnie co najwyżej czterem filozofom. Dzięki temu co najmniej dwom filozofom, siedzącym przy
stole, brakuje co najmniej jednego sąsiada, a zatem co najmniej jeden filozof może jeść (dlaczego?).
Rozwiązanie problemu pięciu filozofów wygląda więc następująco. Na początku wszyscy filozofowie medytują
w przeznaczonej do tego sali. Kiedy któryś z nich poczuje głód, wstaje i kieruje się do jadalni. Jeśli w jadalni jest
mniej niż czterech filozofów, odźwierny przepuszcza go. W przeciwnym razie filozof siada u drzwi jadalni,
czekając na znak odźwiernego. W jadalni filozof zajmuje swoje stałe miejsce i próbuje podnieść najpierw lewą
pałeczkę. Jeśli jest ona używana przez lewego sąsiada, czeka na jej zwolnienie, po czym analogicznie stara się
podnieść prawą. Mając obie pałeczki filozof zaczyna się posilać. Po nasyceniu głodu odkłada najpierw lewą, a
następnie prawą pałeczkę, wstaje i bezszelestnie wraca na swoje miejsce w sali medytacji. Jeśli u progu jadalni
są oczekujący filozofowie, odźwierny wskazuje na jednego z nich, pozwalając mu wejść do jadalni. Wybory
odźwiernego są uczciwe, co znaczy, że żaden z oczekujących nie będzie pomijany w nieskończoność.
Edsger W. Dijkstra, który w 1971 roku opublikował tę starożytną historię, dostosował ją do realiów Zachodu,
m.in. każąc filozofom jeść spaghetti dwoma widelcami. Próbując rozwiązać problem pięciu filozofów, wymyślił
on mechanizm semaforów. Jak widać, znajomość mitologii (i to nie tylko grecko–rzymskiej) może być bardzo
inspirująca.

[EN]
Five philosophers, numbered from 0 through 4, live in a house where the table is laid for them; each philosopher has their own place at the table. Their only problem – besides those of philosophy – is that the dish served is a very difficult kind of spaghetti, that has to be eaten with two forks. There are two forks next to each plate, so that presents no difficulty: as a consequence, however, no two neighbours may be eating simultaneously. 
Each philosopher must alternately think and eat. However, a philosopher can only eat spaghetti when they have both left and right forks. Each fork can be held by only one philosopher at a time and so a philosopher can use the fork only if it is not being used by another philosopher. After an individual philosopher finishes eating, they need to put down both forks so that the forks become available to others. A philosopher can only take the fork on their right or the one on their left as they become available, and they cannot start eating before getting both forks.
