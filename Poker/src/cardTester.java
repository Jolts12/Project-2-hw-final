
//created by John Hughes, Evan Tyler, and Ruth Wittek
public class cardTester {

    public static void main (String args[]) {
        CardSim c = new CardSim(1000);
        c.CreateDeck();
        c.pokerhandCalc();
    }

        
}

/*

Five random cards:
Clubs8
Spades3
Clubs12
Spades3
Diamonds6
1
One Pair

Five random cards:
Diamonds8
Diamonds1
Diamonds7
Clubs1
Hearts3
1
One Pair

Five random cards:
Hearts4
Hearts1
Spades3
Hearts12
Hearts1
1
One Pair

Five random cards:
Spades9
Diamonds8
Diamonds1
Diamonds13
Diamonds9
1
One Pair

Five random cards:
Spades5
Spades5
Diamonds12
Clubs10
Spades10
1
2
Two Pair

Five random cards:
Clubs5
Hearts11
Clubs5
Hearts3
Hearts8
1
One Pair

Five random cards:
Diamonds12
Clubs11
Diamonds10
Spades10
Hearts8
1
One Pair

Five random cards:
Hearts9
Diamonds3
Diamonds13
Spades5
Hearts5
1
One Pair

Five random cards:
Spades11
Hearts9
Spades4
Clubs7
Hearts4
1
One Pair

Five random cards:
Hearts7
Hearts5
Spades12
Diamonds2
Spades11

Five random cards:
Spades9
Diamonds8
Diamonds4
Spades5
Diamonds3

Five random cards:
Spades5
Spades9
Hearts5
Hearts5
Spades13
1
2
3
Three of a kind

Five random cards:
Spades2
Spades12
Diamonds12
Hearts5
Diamonds5
1
2
Two Pair

Five random cards:
Diamonds8
Spades12
Hearts11
Clubs3
Spades1

Five random cards:
Spades8
Diamonds1
Hearts5
Spades7
Diamonds1
1
One Pair

Five random cards:
Clubs9
Spades11
Clubs2
Spades9
Clubs2
1
2
Two Pair

Five random cards:
Spades13
Clubs5
Hearts6
Diamonds6
Spades10
1
One Pair

Five random cards:
Diamonds5
Clubs5
Diamonds12
Hearts9
Hearts5
1
2
3
Three of a kind

Five random cards:
Hearts10
Diamonds9
Diamonds7
Clubs7
Hearts3
1
One Pair

Five random cards:
Spades4
Hearts5
Hearts6
Hearts5
Diamonds6
1
2
Two Pair

Five random cards:
Spades1
Hearts6
Spades1
Diamonds7
Spades10
1
One Pair

Five random cards:
Diamonds4
Hearts9
Hearts5
Clubs7
Diamonds6

Five random cards:
Hearts7
Spades10
Hearts4
Clubs7
Clubs7
1
2
3
Three of a kind

Five random cards:
Spades13
Diamonds11
Hearts8
Hearts11
Diamonds11
1
2
3
Three of a kind

Five random cards:
Spades3
Spades10
Spades1
Spades9
Clubs10
1
One Pair

Five random cards:
Hearts12
Spades8
Clubs9
Diamonds12
Clubs2
1
One Pair

Five random cards:
Diamonds10
Clubs5
Spades9
Diamonds7
Hearts10
1
One Pair

Five random cards:
Hearts11
Spades12
Diamonds12
Diamonds9
Spades11
1
2
Two Pair

Five random cards:
Hearts10
Diamonds10
Spades13
Spades6
Clubs12
1
One Pair

Five random cards:
Spades2
Clubs3
Diamonds10
Hearts5
Spades5
1
One Pair

Five random cards:
Diamonds13
Hearts10
Diamonds4
Diamonds5
Hearts6

Five random cards:
Spades2
Clubs11
Hearts10
Spades6
Hearts8

Five random cards:
Clubs11
Diamonds2
Hearts7
Spades4
Diamonds4
1
One Pair

Five random cards:
Clubs1
Diamonds10
Diamonds7
Hearts6
Spades5

Five random cards:
Diamonds8
Clubs10
Hearts6
Diamonds13
Hearts7

Five random cards:
Hearts10
Hearts3
Spades5
Clubs8
Spades6

Five random cards:
Diamonds11
Spades6
Hearts1
Spades9
Hearts3

Five random cards:
Clubs13
Spades8
Clubs1
Spades7
Clubs12

Five random cards:
Hearts2
Clubs8
Hearts9
Diamonds5
Diamonds5
1
One Pair

Five random cards:
Clubs7
Hearts7
Spades2
Diamonds11
Clubs7
1
2
3
Three of a kind

Five random cards:
Hearts6
Diamonds13
Spades4
Spades3
Diamonds11

Five random cards:
Diamonds11
Spades5
Clubs8
Clubs5
Hearts4
1
One Pair

Five random cards:
Clubs7
Hearts4
Diamonds13
Diamonds4
Diamonds10
1
One Pair

Five random cards:
Hearts11
Diamonds8
Diamonds13
Spades9
Clubs3

Five random cards:
Hearts13
Hearts3
Hearts1
Hearts13
Diamonds12
1
One Pair

Five random cards:
Spades13
Clubs6
Spades9
Diamonds12
Clubs9
1
One Pair

Five random cards:
Clubs11
Clubs9
Hearts10
Clubs3
Clubs7

Five random cards:
Clubs8
Clubs4
Hearts2
Hearts6
Diamonds4
1
One Pair

Five random cards:
Clubs8
Clubs3
Clubs7
Spades1
Hearts2

Five random cards:
Hearts9
Clubs13
Clubs8
Clubs3
Clubs10

Five random cards:
Spades4
Diamonds8
Hearts4
Clubs6
Hearts7
1
One Pair

Five random cards:
Diamonds11
Spades5
Clubs7
Diamonds4
Clubs8

Five random cards:
Diamonds4
Clubs5
Hearts9
Clubs3
Spades9
1
One Pair

Five random cards:
Diamonds5
Spades8
Hearts7
Diamonds11
Clubs6

Five random cards:
Diamonds9
Hearts4
Diamonds2
Spades12
Hearts13

Five random cards:
Spades10
Spades4
Diamonds1
Diamonds1
Diamonds8
1
One Pair

Five random cards:
Spades4
Clubs1
Hearts8
Hearts1
Hearts10
1
One Pair

Five random cards:
Hearts7
Hearts2
Clubs11
Spades11
Hearts7
1
2
Two Pair

Five random cards:
Diamonds6
Diamonds5
Spades1
Spades9
Hearts3

Five random cards:
Spades4
Spades8
Spades8
Spades8
Hearts11
1
2
3
Three of a kind

Five random cards:
Clubs11
Hearts11
Clubs12
Hearts11
Clubs10
1
2
3
Three of a kind

Five random cards:
Spades6
Hearts9
Clubs2
Clubs2
Hearts5
1
One Pair

Five random cards:
Spades13
Clubs4
Diamonds1
Spades7
Diamonds9

Five random cards:
Spades11
Spades9
Clubs7
Spades4
Hearts9
1
One Pair

Five random cards:
Diamonds3
Hearts1
Diamonds12
Hearts13
Spades6

Five random cards:
Hearts7
Diamonds12
Hearts11
Clubs11
Diamonds2
1
One Pair

Five random cards:
Clubs4
Diamonds3
Clubs6
Spades3
Hearts4
1
2
Two Pair

Five random cards:
Diamonds5
Spades13
Spades12
Clubs1
Spades8

Five random cards:
Spades1
Hearts10
Spades8
Clubs11
Clubs12

Five random cards:
Diamonds11
Hearts1
Hearts6
Diamonds5
Diamonds5
1
One Pair

Five random cards:
Diamonds13
Clubs8
Spades9
Clubs13
Spades7
1
One Pair

Five random cards:
Clubs12
Diamonds8
Clubs1
Diamonds5
Clubs3

Five random cards:
Hearts2
Spades8
Hearts13
Diamonds11
Spades13
1
One Pair

Five random cards:
Diamonds11
Clubs3
Spades5
Clubs1
Diamonds10

Five random cards:
Spades6
Spades13
Clubs12
Diamonds6
Hearts4
1
One Pair

Five random cards:
Spades4
Diamonds2
Diamonds5
Hearts13
Clubs9

Five random cards:
Diamonds2
Hearts7
Clubs8
Hearts5
Spades7
1
One Pair

Five random cards:
Clubs6
Diamonds1
Hearts6
Hearts12
Spades12
1
2
Two Pair

Five random cards:
Hearts11
Clubs3
Clubs12
Spades2
Hearts7

Five random cards:
Hearts13
Clubs1
Clubs10
Hearts3
Hearts12

Five random cards:
Clubs4
Clubs9
Spades6
Clubs9
Diamonds3
1
One Pair

Five random cards:
Spades3
Clubs8
Hearts11
Spades3
Spades3
1
2
3
Three of a kind

Five random cards:
Clubs10
Clubs7
Diamonds6
Hearts13
Diamonds13
1
One Pair

Five random cards:
Clubs5
Clubs11
Hearts13
Clubs11
Clubs5
1
2
Two Pair

Five random cards:
Spades2
Spades1
Hearts9
Diamonds5
Clubs1
1
One Pair

Five random cards:
Hearts4
Hearts11
Spades3
Clubs12
Spades5

Five random cards:
Clubs9
Hearts4
Spades10
Clubs11
Diamonds6

Five random cards:
Clubs10
Spades13
Diamonds8
Clubs5
Hearts12

Five random cards:
Clubs11
Hearts12
Spades8
Hearts11
Spades7
1
One Pair

Five random cards:
Hearts10
Spades13
Diamonds9
Hearts9
Clubs13
1
2
Two Pair

Five random cards:
Hearts11
Spades7
Spades5
Clubs7
Clubs12
1
One Pair

Five random cards:
Hearts10
Diamonds1
Diamonds2
Spades10
Diamonds10
1
2
3
Three of a kind

Five random cards:
Diamonds6
Spades8
Clubs8
Clubs8
Clubs10
1
2
3
Three of a kind

Five random cards:
Clubs3
Diamonds7
Spades5
Spades7
Hearts9
1
One Pair

Five random cards:
Diamonds13
Diamonds4
Hearts9
Spades10
Diamonds6

Five random cards:
Hearts12
Spades6
Hearts5
Clubs2
Hearts12
1
One Pair

Five random cards:
Spades2
Spades12
Hearts2
Spades4
Diamonds8
1
One Pair

Five random cards:
Spades2
Spades8
Diamonds10
Spades10
Clubs6
1
One Pair

Five random cards:
Hearts4
Diamonds10
Diamonds1
Clubs8
Hearts13

Five random cards:
Clubs8
Spades12
Hearts9
Diamonds7
Clubs8
1
One Pair

Five random cards:
Clubs10
Hearts2
Spades3
Spades12
Diamonds10
1
One Pair

Five random cards:
Diamonds10
Diamonds10
Diamonds10
Clubs12
Hearts8
1
2
3
Three of a kind

Five random cards:
Spades13
Diamonds9
Clubs12
Diamonds13
Hearts12
1
2
Two Pair

Five random cards:
Diamonds9
Diamonds5
Hearts11
Hearts5
Clubs10
1
One Pair

Five random cards:
Diamonds1
Diamonds2
Clubs3
Spades9
Clubs11

Five random cards:
Spades3
Diamonds6
Diamonds2
Diamonds6
Clubs4
1
One Pair

Five random cards:
Hearts8
Diamonds1
Clubs5
Diamonds7
Diamonds1
1
One Pair

Five random cards:
Spades11
Hearts1
Clubs7
Diamonds1
Spades4
1
One Pair

Five random cards:
Spades10
Diamonds6
Clubs13
Spades13
Diamonds7
1
One Pair

Five random cards:
Clubs11
Clubs9
Hearts6
Clubs9
Diamonds9
1
2
3
Three of a kind

Five random cards:
Hearts3
Hearts13
Clubs5
Spades8
Diamonds7

Five random cards:
Spades8
Spades13
Hearts13
Diamonds2
Hearts3
1
One Pair

Five random cards:
Spades9
Hearts10
Hearts8
Diamonds7
Clubs2

Five random cards:
Clubs11
Clubs4
Clubs5
Clubs8
Hearts11
1
One Pair

Five random cards:
Hearts8
Hearts4
Clubs6
Clubs6
Spades13
1
One Pair

Five random cards:
Clubs5
Spades5
Hearts8
Spades4
Clubs2
1
One Pair

Five random cards:
Hearts12
Clubs6
Diamonds1
Diamonds12
Diamonds11
1
One Pair

Five random cards:
Spades5
Clubs1
Hearts7
Diamonds10
Diamonds4

Five random cards:
Clubs6
Hearts10
Spades8
Spades10
Diamonds13
1
One Pair

Five random cards:
Diamonds4
Diamonds5
Hearts12
Diamonds3
Diamonds6

Five random cards:
Hearts10
Hearts10
Spades3
Clubs10
Clubs9
1
2
3
Three of a kind

Five random cards:
Spades13
Clubs7
Hearts9
Diamonds7
Diamonds1
1
One Pair

Five random cards:
Hearts13
Diamonds3
Spades2
Hearts4
Diamonds13
1
One Pair

Five random cards:
Spades7
Hearts1
Diamonds13
Hearts1
Clubs5
1
One Pair

Five random cards:
Spades3
Clubs8
Clubs3
Spades4
Clubs12
1
One Pair

Five random cards:
Hearts1
Diamonds13
Hearts1
Diamonds4
Clubs3
1
One Pair

Five random cards:
Spades12
Diamonds4
Spades4
Clubs8
Diamonds10
1
One Pair

Five random cards:
Hearts7
Clubs11
Clubs2
Clubs8
Diamonds9

Five random cards:
Hearts10
Diamonds9
Spades12
Clubs9
Clubs4
1
One Pair

Five random cards:
Spades2
Clubs10
Clubs13
Spades11
Spades12

Five random cards:
Diamonds12
Diamonds4
Spades8
Hearts1
Diamonds4
1
One Pair

Five random cards:
Hearts11
Spades11
Spades6
Hearts4
Diamonds5
1
One Pair

Five random cards:
Diamonds7
Clubs10
Diamonds1
Diamonds10
Clubs12
1
One Pair

Five random cards:
Diamonds10
Hearts3
Diamonds5
Diamonds4
Clubs12

Five random cards:
Clubs3
Clubs5
Spades1
Spades6
Diamonds5
1
One Pair

Five random cards:
Diamonds11
Hearts6
Diamonds5
Diamonds2
Diamonds11
1
One Pair

Five random cards:
Diamonds9
Diamonds12
Hearts1
Hearts7
Spades1
1
One Pair

Five random cards:
Spades3
Clubs2
Hearts4
Hearts12
Diamonds5

Five random cards:
Hearts6
Hearts4
Spades6
Clubs7
Diamonds11
1
One Pair

Five random cards:
Clubs10
Hearts9
Hearts3
Diamonds11
Hearts3
1
One Pair

Five random cards:
Clubs13
Clubs2
Clubs2
Clubs7
Clubs7
1
2
Two Pair

 It is a Flush

Five random cards:
Spades5
Clubs5
Diamonds3
Hearts13
Clubs8
1
One Pair

Five random cards:
Spades1
Clubs5
Spades4
Diamonds7
Spades13

Five random cards:
Diamonds3
Diamonds2
Clubs13
Clubs3
Diamonds13
1
2
Two Pair

Five random cards:
Spades1
Spades7
Hearts8
Spades4
Spades7
1
One Pair

Five random cards:
Diamonds11
Diamonds12
Hearts8
Clubs10
Hearts4

Five random cards:
Clubs9
Spades10
Clubs10
Hearts3
Diamonds10
1
2
3
Three of a kind

Five random cards:
Diamonds7
Hearts12
Diamonds13
Clubs3
Clubs4

Five random cards:
Diamonds1
Diamonds11
Hearts3
Hearts3
Spades6
1
One Pair

Five random cards:
Hearts12
Spades7
Spades8
Spades10
Clubs13

Five random cards:
Hearts6
Diamonds2
Spades12
Diamonds2
Clubs6
1
2
Two Pair

Five random cards:
Hearts4
Diamonds8
Spades1
Spades3
Spades12

Five random cards:
Clubs5
Hearts5
Clubs1
Spades2
Hearts4
1
One Pair

Five random cards:
Hearts11
Clubs11
Spades3
Hearts10
Hearts8
1
One Pair

Five random cards:
Hearts11
Clubs3
Clubs3
Spades6
Clubs10
1
One Pair

Five random cards:
Clubs7
Diamonds10
Hearts5
Spades12
Spades6

Five random cards:
Clubs8
Clubs1
Hearts3
Spades7
Clubs6

Five random cards:
Diamonds5
Hearts2
Spades12
Clubs3
Diamonds7

Five random cards:
Spades4
Diamonds9
Diamonds13
Hearts10
Clubs9
1
One Pair

Five random cards:
Spades13
Clubs8
Clubs2
Spades13
Clubs11
1
One Pair

Five random cards:
Diamonds2
Spades4
Hearts8
Spades8
Diamonds2
1
2
Two Pair

Five random cards:
Hearts3
Spades12
Diamonds2
Hearts6
Diamonds3
1
One Pair

Five random cards:
Spades13
Diamonds5
Hearts6
Clubs10
Diamonds10
1
One Pair

Five random cards:
Spades9
Diamonds12
Spades9
Diamonds12
Hearts3
1
2
Two Pair

Five random cards:
Clubs12
Clubs9
Clubs6
Diamonds5
Spades3

 It is a Straight

Five random cards:
Hearts10
Clubs2
Spades6
Spades4
Hearts8

Five random cards:
Clubs8
Clubs2
Clubs5
Clubs13
Hearts11

Five random cards:
Clubs6
Hearts1
Hearts10
Diamonds7
Hearts13

Five random cards:
Clubs9
Diamonds11
Spades3
Clubs5
Hearts8

Five random cards:
Diamonds3
Clubs6
Spades7
Diamonds9
Clubs6
1
One Pair

Five random cards:
Clubs7
Hearts6
Diamonds8
Hearts5
Spades10

Five random cards:
Diamonds1
Hearts5
Hearts4
Clubs12
Clubs1
1
One Pair

Five random cards:
Diamonds8
Diamonds9
Clubs6
Clubs11
Clubs7

Five random cards:
Clubs8
Clubs7
Clubs7
Clubs11
Clubs9
1
One Pair

 It is a Flush

Five random cards:
Spades7
Hearts1
Diamonds5
Hearts8
Hearts1
1
One Pair

Five random cards:
Spades7
Diamonds3
Hearts5
Hearts3
Hearts8
1
One Pair

Five random cards:
Diamonds7
Hearts3
Spades12
Hearts2
Hearts13

Five random cards:
Clubs6
Hearts7
Hearts12
Spades4
Spades13

Five random cards:
Hearts5
Spades3
Spades9
Hearts4
Diamonds6

Five random cards:
Diamonds10
Hearts3
Clubs3
Hearts5
Clubs4
1
One Pair

Five random cards:
Diamonds1
Diamonds1
Hearts9
Diamonds5
Hearts9
1
2
Two Pair

Five random cards:
Hearts3
Diamonds11
Diamonds8
Spades5
Clubs5
1
One Pair

Five random cards:
Clubs9
Diamonds12
Diamonds4
Spades3
Spades1

Five random cards:
Diamonds6
Hearts3
Hearts8
Spades6
Clubs9
1
One Pair

Five random cards:
Clubs9
Diamonds11
Spades9
Diamonds1
Clubs4
1
One Pair

Five random cards:
Diamonds2
Diamonds3
Clubs6
Clubs5
Spades6
1
One Pair

Five random cards:
Diamonds11
Hearts9
Clubs8
Clubs8
Diamonds13
1
One Pair

Five random cards:
Diamonds10
Hearts3
Clubs4
Diamonds8
Diamonds5

Five random cards:
Spades3
Diamonds12
Hearts8
Hearts13
Clubs4

Five random cards:
Hearts4
Clubs6
Spades5
Clubs6
Hearts4
1
2
Two Pair

Five random cards:
Hearts1
Hearts5
Clubs9
Diamonds3
Clubs6

Five random cards:
Hearts6
Clubs1
Hearts5
Hearts3
Hearts6
1
One Pair

Five random cards:
Diamonds10
Spades1
Diamonds1
Clubs3
Spades8
1
One Pair

Five random cards:
Spades4
Diamonds9
Clubs3
Spades5
Spades7

Five random cards:
Diamonds7
Diamonds10
Diamonds1
Clubs3
Hearts10
1
One Pair

Five random cards:
Hearts4
Hearts3
Diamonds11
Diamonds10
Spades10
1
One Pair

Five random cards:
Clubs6
Hearts10
Clubs11
Clubs4
Clubs11
1
One Pair

Five random cards:
Spades13
Clubs7
Spades9
Clubs6
Diamonds7
1
One Pair

Five random cards:
Diamonds10
Diamonds8
Clubs9
Diamonds3
Diamonds11

Five random cards:
Spades8
Hearts13
Spades9
Hearts4
Clubs1

Five random cards:
Clubs11
Diamonds11
Clubs12
Diamonds9
Diamonds2
1
One Pair

Five random cards:
Clubs13
Clubs6
Clubs13
Hearts10
Spades4
1
One Pair

Five random cards:
Clubs13
Clubs8
Diamonds5
Clubs8
Clubs13
1
2
Two Pair

Five random cards:
Hearts6
Clubs7
Diamonds11
Hearts6
Hearts6
1
2
3
Three of a kind

Five random cards:
Hearts9
Hearts12
Clubs4
Diamonds6
Hearts11

Five random cards:
Clubs1
Clubs9
Hearts2
Spades11
Diamonds13

Five random cards:
Diamonds4
Hearts10
Hearts10
Diamonds6
Diamonds13
1
One Pair

Five random cards:
Clubs9
Clubs5
Clubs2
Hearts9
Spades13
1
One Pair

Five random cards:
Diamonds9
Hearts4
Clubs4
Hearts1
Diamonds1
1
2
Two Pair

Five random cards:
Clubs8
Clubs2
Spades4
Spades3
Spades10

Five random cards:
Spades1
Spades8
Spades10
Clubs4
Spades6

Five random cards:
Diamonds3
Clubs6
Diamonds2
Hearts3
Diamonds8
1
One Pair

Five random cards:
Clubs8
Clubs3
Spades5
Spades5
Hearts2
1
One Pair

Five random cards:
Spades5
Spades13
Spades13
Spades5
Spades11
1
2
Two Pair

 It is a Flush

Five random cards:
Hearts4
Clubs2
Clubs7
Clubs13
Diamonds6

Five random cards:
Spades5
Spades2
Diamonds1
Spades1
Spades4
1
One Pair

Five random cards:
Spades4
Hearts1
Clubs8
Clubs5
Spades10

Five random cards:
Spades6
Diamonds11
Hearts4
Diamonds11
Diamonds2
1
One Pair

Five random cards:
Clubs6
Spades9
Spades3
Diamonds5
Spades5
1
One Pair

Five random cards:
Hearts7
Clubs10
Clubs8
Hearts4
Hearts8
1
One Pair

Five random cards:
Spades12
Diamonds13
Spades1
Spades10
Spades2

Five random cards:
Hearts2
Diamonds7
Clubs5
Spades12
Spades9

Five random cards:
Spades11
Diamonds5
Spades11
Clubs3
Clubs4
1
One Pair

Five random cards:
Clubs4
Clubs5
Diamonds11
Spades6
Spades13

Five random cards:
Hearts13
Hearts11
Diamonds1
Clubs1
Clubs9
1
One Pair

Five random cards:
Spades2
Diamonds5
Spades11
Hearts13
Hearts12

Five random cards:
Spades9
Diamonds12
Spades9
Clubs6
Clubs3
1
One Pair

Five random cards:
Spades6
Hearts5
Hearts2
Diamonds13
Clubs11

Five random cards:
Diamonds11
Diamonds11
Spades10
Clubs12
Diamonds5
1
One Pair

Five random cards:
Spades5
Diamonds7
Spades5
Hearts8
Diamonds7
1
2
Two Pair

Five random cards:
Clubs10
Diamonds1
Spades13
Spades13
Hearts2
1
One Pair

Five random cards:
Hearts6
Diamonds8
Hearts6
Clubs5
Diamonds10
1
One Pair

Five random cards:
Diamonds11
Clubs9
Spades10
Spades5
Hearts3

Five random cards:
Diamonds10
Clubs11
Spades3
Clubs5
Hearts6

Five random cards:
Spades2
Clubs2
Diamonds5
Spades7
Diamonds3
1
One Pair

Five random cards:
Spades5
Hearts1
Diamonds6
Hearts7
Hearts1
1
One Pair

Five random cards:
Clubs8
Spades12
Hearts1
Diamonds8
Clubs10
1
One Pair

Five random cards:
Clubs8
Hearts9
Hearts10
Diamonds12
Spades2

Five random cards:
Clubs7
Clubs8
Diamonds13
Hearts13
Clubs10
1
One Pair

Five random cards:
Spades8
Diamonds11
Hearts7
Hearts2
Diamonds12

Five random cards:
Clubs7
Diamonds6
Clubs13
Spades7
Diamonds6
1
2
Two Pair

Five random cards:
Hearts13
Spades8
Diamonds8
Hearts2
Diamonds3
1
One Pair

Five random cards:
Clubs6
Diamonds13
Diamonds13
Hearts10
Hearts3
1
One Pair

Five random cards:
Spades13
Hearts4
Diamonds2
Diamonds7
Diamonds10

Five random cards:
Spades7
Hearts11
Spades7
Spades1
Hearts9
1
One Pair

Five random cards:
Diamonds5
Spades6
Clubs3
Hearts10
Hearts8

Five random cards:
Diamonds2
Clubs6
Clubs13
Clubs6
Hearts3
1
One Pair

Five random cards:
Spades2
Spades1
Spades4
Spades12
Clubs11

Five random cards:
Clubs7
Spades1
Hearts9
Clubs9
Clubs9
1
2
3
Three of a kind

Five random cards:
Diamonds5
Clubs1
Diamonds13
Clubs4
Diamonds5
1
One Pair

Five random cards:
Diamonds6
Diamonds7
Hearts9
Spades8
Spades10

Five random cards:
Clubs6
Diamonds13
Diamonds7
Spades7
Hearts1
1
One Pair

Five random cards:
Diamonds4
Hearts9
Hearts9
Spades7
Diamonds8
1
One Pair

Five random cards:
Spades5
Diamonds12
Hearts10
Spades4
Clubs8

Five random cards:
Clubs7
Spades11
Spades12
Diamonds12
Clubs1
1
One Pair

Five random cards:
Hearts5
Spades3
Spades6
Hearts13
Hearts12

Five random cards:
Hearts8
Clubs7
Clubs4
Diamonds12
Hearts11

Five random cards:
Diamonds9
Clubs12
Diamonds8
Hearts6
Diamonds5

Five random cards:
Spades9
Hearts2
Hearts1
Hearts5
Spades9
1
One Pair

Five random cards:
Hearts7
Diamonds12
Diamonds11
Hearts13
Clubs10

Five random cards:
Hearts12
Diamonds13
Spades9
Diamonds10
Hearts13
1
One Pair

Five random cards:
Spades3
Hearts11
Hearts5
Spades5
Spades11
1
2
Two Pair

Five random cards:
Spades11
Clubs1
Clubs2
Diamonds3
Diamonds1
1
One Pair

Five random cards:
Spades12
Diamonds12
Spades3
Diamonds11
Clubs2
1
One Pair

Five random cards:
Hearts8
Spades11
Hearts11
Diamonds6
Spades13
1
One Pair

Five random cards:
Clubs3
Diamonds11
Clubs8
Clubs8
Diamonds8
1
2
3
Three of a kind

Five random cards:
Clubs6
Clubs13
Spades9
Hearts5
Clubs10

Five random cards:
Spades6
Spades12
Spades13
Diamonds3
Spades7

Five random cards:
Clubs4
Diamonds8
Clubs10
Clubs8
Clubs9
1
One Pair

Five random cards:
Clubs12
Clubs7
Hearts7
Hearts10
Hearts5
1
One Pair

Five random cards:
Spades6
Diamonds5
Spades1
Hearts10
Clubs5
1
One Pair

Five random cards:
Hearts11
Hearts8
Spades10
Spades9
Spades8
1
One Pair

Five random cards:
Spades3
Spades13
Diamonds13
Spades12
Clubs1
1
One Pair

Five random cards:
Hearts3
Hearts2
Hearts10
Spades5
Hearts2
1
One Pair

Five random cards:
Diamonds12
Spades7
Diamonds11
Clubs7
Spades11
1
2
Two Pair

Five random cards:
Spades2
Diamonds2
Clubs4
Hearts9
Spades4
1
2
Two Pair

Five random cards:
Diamonds9
Diamonds3
Diamonds7
Clubs5
Clubs5
1
One Pair

Five random cards:
Spades11
Hearts13
Hearts3
Hearts13
Hearts1
1
One Pair

Five random cards:
Clubs3
Spades7
Clubs6
Hearts6
Clubs8
1
One Pair

Five random cards:
Spades8
Spades2
Hearts6
Clubs11
Spades3

Five random cards:
Spades6
Spades7
Clubs13
Hearts12
Hearts10

Five random cards:
Spades11
Clubs8
Spades10
Clubs5
Diamonds2

Five random cards:
Hearts10
Spades8
Diamonds4
Hearts1
Clubs6

Five random cards:
Hearts2
Hearts5
Hearts8
Hearts4
Spades11

Five random cards:
Spades2
Diamonds9
Diamonds3
Diamonds4
Diamonds7

Five random cards:
Hearts11
Spades1
Hearts10
Clubs12
Hearts3

Five random cards:
Diamonds9
Clubs2
Spades3
Clubs10
Spades3
1
One Pair

Five random cards:
Hearts7
Clubs10
Clubs8
Spades13
Diamonds7
1
One Pair

Five random cards:
Spades8
Hearts12
Hearts8
Clubs3
Clubs8
1
2
3
Three of a kind

Five random cards:
Hearts13
Clubs5
Diamonds5
Diamonds2
Hearts3
1
One Pair

Five random cards:
Diamonds12
Hearts7
Clubs4
Clubs1
Diamonds12
1
One Pair

Five random cards:
Diamonds1
Spades13
Diamonds5
Clubs10
Hearts2

Five random cards:
Diamonds13
Hearts4
Clubs7
Diamonds4
Clubs7
1
2
Two Pair

Five random cards:
Spades12
Clubs5
Spades5
Hearts5
Spades1
1
2
3
Three of a kind

Five random cards:
Hearts7
Spades13
Hearts11
Hearts8
Hearts4

Five random cards:
Spades13
Clubs1
Clubs1
Diamonds8
Spades5
1
One Pair

Five random cards:
Diamonds7
Diamonds2
Diamonds6
Clubs9
Spades13

Five random cards:
Clubs11
Diamonds10
Clubs3
Hearts7
Clubs7
1
One Pair

Five random cards:
Hearts6
Hearts4
Clubs4
Diamonds2
Hearts1
1
One Pair

Five random cards:
Hearts2
Hearts8
Diamonds7
Hearts4
Hearts4
1
One Pair

Five random cards:
Diamonds5
Diamonds10
Hearts1
Hearts1
Clubs1
1
2
3
Three of a kind

Five random cards:
Clubs10
Diamonds12
Spades12
Diamonds4
Clubs10
1
2
Two Pair

Five random cards:
Spades2
Diamonds5
Diamonds12
Diamonds9
Diamonds12
1
One Pair

Five random cards:
Diamonds3
Hearts12
Diamonds3
Diamonds3
Diamonds8
1
2
3
Three of a kind

Five random cards:
Diamonds2
Diamonds2
Diamonds4
Hearts3
Clubs11
1
One Pair

Five random cards:
Clubs1
Spades3
Diamonds1
Spades9
Hearts12
1
One Pair

Five random cards:
Hearts7
Hearts13
Hearts13
Diamonds13
Hearts8
1
2
3
Three of a kind

Five random cards:
Hearts5
Hearts8
Hearts1
Diamonds12
Spades8
1
One Pair

Five random cards:
Hearts7
Clubs8
Clubs2
Diamonds13
Clubs11

Five random cards:
Spades7
Spades1
Spades9
Diamonds8
Clubs1
1
One Pair

Five random cards:
Hearts7
Clubs7
Hearts1
Diamonds4
Diamonds5
1
One Pair

Five random cards:
Diamonds5
Spades4
Diamonds8
Spades6
Hearts11

Five random cards:
Hearts8
Clubs13
Diamonds10
Spades3
Hearts2

Five random cards:
Spades13
Hearts8
Diamonds13
Diamonds1
Hearts9
1
One Pair

Five random cards:
Clubs5
Clubs10
Hearts7
Hearts8
Diamonds11

Five random cards:
Diamonds11
Spades5
Diamonds10
Diamonds1
Diamonds6

Five random cards:
Hearts9
Diamonds1
Clubs11
Hearts10
Hearts11
1
One Pair

Five random cards:
Diamonds10
Spades1
Clubs5
Clubs8
Diamonds6

Five random cards:
Clubs9
Diamonds6
Diamonds3
Hearts10
Hearts1

Five random cards:
Clubs1
Clubs1
Hearts2
Hearts11
Hearts1
1
2
3
Three of a kind

Five random cards:
Spades12
Hearts13
Clubs13
Hearts13
Diamonds1
1
2
3
Three of a kind

Five random cards:
Hearts4
Spades13
Diamonds12
Spades5
Spades6

Five random cards:
Spades7
Spades8
Clubs1
Spades1
Hearts9
1
One Pair

Five random cards:
Hearts9
Diamonds13
Hearts13
Clubs9
Spades11
1
2
Two Pair

Five random cards:
Diamonds1
Spades7
Clubs10
Hearts8
Diamonds4

Five random cards:
Diamonds13
Hearts7
Spades3
Clubs2
Hearts8

Five random cards:
Diamonds1
Diamonds6
Spades11
Spades7
Diamonds9

Five random cards:
Diamonds6
Spades11
Diamonds9
Hearts6
Spades1
1
One Pair

Five random cards:
Clubs10
Diamonds8
Hearts12
Spades5
Clubs3

Five random cards:
Spades10
Spades10
Spades5
Spades10
Hearts6
1
2
3
Three of a kind

Five random cards:
Clubs8
Diamonds13
Clubs8
Hearts2
Hearts4
1
One Pair

Five random cards:
Clubs12
Clubs12
Diamonds2
Spades3
Spades2
1
2
Two Pair

Five random cards:
Spades2
Hearts3
Clubs9
Diamonds13
Spades12

Five random cards:
Hearts1
Diamonds9
Spades5
Hearts12
Diamonds10

Five random cards:
Clubs9
Clubs9
Clubs13
Diamonds2
Diamonds5
1
One Pair

Five random cards:
Diamonds11
Hearts8
Hearts13
Hearts8
Hearts1
1
One Pair

Five random cards:
Hearts5
Spades10
Diamonds8
Diamonds1
Diamonds5
1
One Pair

Five random cards:
Diamonds11
Spades9
Spades5
Clubs6
Hearts2

Five random cards:
Spades13
Clubs12
Hearts13
Spades9
Clubs8
1
One Pair

Five random cards:
Diamonds1
Diamonds11
Hearts12
Hearts12
Hearts13
1
One Pair

Five random cards:
Diamonds3
Spades7
Hearts1
Clubs10
Hearts6

Five random cards:
Diamonds1
Diamonds9
Clubs9
Clubs7
Diamonds11
1
One Pair

Five random cards:
Diamonds4
Clubs5
Clubs4
Clubs5
Diamonds6
1
2
Two Pair

Five random cards:
Diamonds6
Hearts5
Diamonds1
Clubs5
Hearts8
1
One Pair

Five random cards:
Spades1
Hearts2
Spades1
Hearts8
Clubs12
1
One Pair

Five random cards:
Clubs6
Hearts7
Hearts3
Clubs10
Clubs12

Five random cards:
Diamonds12
Diamonds6
Clubs2
Clubs13
Diamonds7

Five random cards:
Hearts11
Clubs3
Clubs3
Spades8
Hearts11
1
2
Two Pair

Five random cards:
Hearts3
Spades7
Diamonds4
Diamonds2
Diamonds9

Five random cards:
Clubs12
Clubs13
Clubs4
Clubs4
Hearts13
1
2
Two Pair

Five random cards:
Hearts1
Spades8
Diamonds4
Diamonds12
Hearts2

Five random cards:
Spades3
Diamonds1
Clubs3
Hearts10
Spades4
1
One Pair

Five random cards:
Spades6
Hearts9
Clubs13
Clubs1
Hearts6
1
One Pair

Five random cards:
Diamonds2
Hearts12
Clubs13
Clubs10
Diamonds6

Five random cards:
Diamonds13
Clubs3
Diamonds11
Hearts6
Hearts5

Five random cards:
Diamonds2
Diamonds9
Spades12
Clubs2
Clubs1
1
One Pair

Five random cards:
Diamonds2
Clubs10
Spades5
Clubs11
Clubs13

Five random cards:
Clubs9
Spades10
Spades9
Diamonds7
Clubs12
1
One Pair

Five random cards:
Clubs3
Hearts5
Spades6
Clubs3
Spades9
1
One Pair

Five random cards:
Clubs7
Clubs1
Spades6
Spades7
Spades9
1
One Pair

Five random cards:
Hearts12
Clubs3
Hearts5
Hearts4
Hearts8

Five random cards:
Diamonds13
Diamonds8
Diamonds12
Hearts8
Spades4
1
One Pair

Five random cards:
Diamonds3
Spades13
Diamonds11
Clubs4
Spades7

Five random cards:
Spades3
Spades8
Hearts1
Diamonds12
Clubs1
1
One Pair

Five random cards:
Hearts12
Diamonds4
Diamonds2
Diamonds2
Spades10
1
One Pair

Five random cards:
Diamonds7
Diamonds8
Hearts2
Clubs6
Hearts3

Five random cards:
Diamonds11
Hearts13
Diamonds11
Hearts13
Diamonds10
1
2
Two Pair

Five random cards:
Hearts9
Clubs13
Hearts2
Spades11
Clubs6

Five random cards:
Clubs2
Spades10
Hearts12
Spades13
Clubs8

Five random cards:
Spades7
Clubs7
Diamonds9
Clubs2
Diamonds11
1
One Pair

Five random cards:
Clubs12
Hearts5
Hearts6
Clubs8
Diamonds11

Five random cards:
Clubs4
Diamonds5
Hearts11
Spades13
Diamonds10

Five random cards:
Clubs6
Diamonds11
Hearts10
Clubs6
Spades4
1
One Pair

Five random cards:
Clubs7
Clubs9
Diamonds10
Hearts10
Hearts12
1
One Pair

Five random cards:
Diamonds5
Spades1
Hearts12
Hearts13
Hearts13
1
One Pair

Five random cards:
Spades5
Spades5
Spades13
Clubs8
Clubs8
1
2
Two Pair

Five random cards:
Diamonds8
Spades7
Hearts7
Diamonds12
Spades10
1
One Pair

Five random cards:
Clubs4
Clubs11
Clubs11
Clubs5
Clubs4
1
2
Two Pair

 It is a Flush

Five random cards:
Diamonds7
Hearts13
Hearts13
Diamonds9
Diamonds3
1
One Pair

Five random cards:
Spades6
Clubs11
Spades4
Diamonds11
Diamonds1
1
One Pair

Five random cards:
Clubs1
Clubs9
Clubs9
Hearts2
Clubs11
1
One Pair

Five random cards:
Diamonds9
Clubs11
Diamonds4
Spades7
Diamonds2

Five random cards:
Clubs12
Spades3
Hearts8
Spades1
Diamonds4

Five random cards:
Diamonds7
Diamonds10
Diamonds10
Diamonds7
Hearts13
1
2
Two Pair

Five random cards:
Spades10
Spades8
Diamonds2
Hearts9
Diamonds8
1
One Pair

Five random cards:
Diamonds7
Hearts8
Clubs2
Diamonds1
Clubs10

Five random cards:
Hearts2
Clubs4
Spades11
Clubs6
Hearts2
1
One Pair

Five random cards:
Spades7
Clubs13
Spades13
Spades6
Hearts12
1
One Pair

Five random cards:
Spades2
Spades4
Clubs13
Clubs7
Clubs13
1
One Pair

Five random cards:
Hearts5
Hearts12
Diamonds13
Clubs10
Spades2

Five random cards:
Clubs6
Clubs6
Diamonds5
Hearts1
Clubs3
1
One Pair

Five random cards:
Spades4
Spades4
Clubs4
Clubs5
Diamonds12
1
2
3
Three of a kind

Five random cards:
Spades9
Clubs4
Diamonds7
Spades9
Hearts4
1
2
Two Pair

Five random cards:
Clubs8
Diamonds4
Spades11
Spades1
Spades9

Five random cards:
Clubs3
Clubs2
Clubs6
Clubs3
Diamonds10
1
One Pair

Five random cards:
Spades7
Diamonds1
Diamonds1
Diamonds9
Clubs8
1
One Pair

Five random cards:
Diamonds12
Diamonds1
Spades6
Clubs11
Hearts11
1
One Pair

Five random cards:
Hearts5
Diamonds8
Spades9
Spades3
Spades3
1
One Pair

Five random cards:
Clubs4
Spades11
Spades13
Spades13
Spades1
1
One Pair

Five random cards:
Spades9
Diamonds9
Spades6
Hearts7
Diamonds13
1
One Pair

Five random cards:
Hearts6
Hearts7
Diamonds4
Diamonds10
Diamonds4
1
One Pair

Five random cards:
Diamonds5
Clubs8
Spades10
Diamonds13
Diamonds4

Five random cards:
Hearts9
Hearts3
Clubs6
Hearts2
Hearts1

Five random cards:
Clubs13
Spades4
Spades4
Diamonds2
Diamonds9
1
One Pair

Five random cards:
Diamonds7
Hearts3
Hearts3
Clubs11
Diamonds12
1
One Pair

Five random cards:
Spades3
Spades3
Spades5
Diamonds12
Hearts4
1
One Pair

Five random cards:
Clubs12
Hearts3
Hearts5
Clubs3
Diamonds3
1
2
3
Three of a kind

Five random cards:
Spades5
Clubs5
Diamonds13
Clubs11
Spades6
1
One Pair

Five random cards:
Clubs4
Spades5
Hearts13
Diamonds10
Diamonds7

Five random cards:
Diamonds7
Clubs9
Spades8
Clubs9
Clubs12
1
One Pair

Five random cards:
Spades2
Clubs12
Hearts10
Clubs2
Spades7
1
One Pair

Five random cards:
Diamonds8
Spades9
Spades12
Spades8
Spades3
1
One Pair

Five random cards:
Hearts13
Clubs6
Diamonds1
Diamonds10
Clubs2

Five random cards:
Clubs9
Clubs12
Hearts8
Diamonds12
Hearts9
1
2
Two Pair

Five random cards:
Hearts3
Diamonds12
Spades1
Hearts4
Hearts3
1
One Pair

Five random cards:
Hearts5
Spades13
Spades1
Hearts5
Diamonds11
1
One Pair

Five random cards:
Diamonds6
Spades8
Hearts4
Clubs10
Spades4
1
One Pair

Five random cards:
Diamonds11
Clubs3
Spades13
Clubs1
Hearts13
1
One Pair

Five random cards:
Diamonds2
Hearts3
Clubs6
Hearts8
Diamonds2
1
One Pair

Five random cards:
Diamonds13
Spades1
Diamonds5
Clubs5
Spades10
1
One Pair

Five random cards:
Hearts1
Diamonds13
Diamonds13
Spades9
Spades9
1
2
Two Pair

Five random cards:
Clubs4
Clubs13
Diamonds9
Diamonds4
Diamonds13
1
2
Two Pair

Five random cards:
Clubs13
Diamonds3
Clubs5
Spades8
Hearts10

Five random cards:
Hearts9
Clubs2
Spades7
Spades7
Clubs7
1
2
3
Three of a kind

Five random cards:
Clubs6
Hearts12
Hearts12
Diamonds5
Diamonds5
1
2
Two Pair

Five random cards:
Diamonds12
Hearts2
Clubs8
Spades1
Spades4

Five random cards:
Spades6
Diamonds12
Spades9
Clubs9
Clubs8
1
One Pair

Five random cards:
Spades9
Clubs8
Diamonds1
Hearts1
Clubs2
1
One Pair

Five random cards:
Spades6
Diamonds1
Diamonds1
Hearts12
Spades6
1
2
Two Pair

Five random cards:
Spades10
Hearts5
Hearts7
Diamonds13
Clubs5
1
One Pair

Five random cards:
Hearts8
Clubs12
Hearts10
Spades5
Spades12
1
One Pair

Five random cards:
Spades4
Spades8
Spades11
Clubs8
Hearts12
1
One Pair

Five random cards:
Diamonds7
Diamonds13
Diamonds4
Spades5
Hearts12

Five random cards:
Spades1
Clubs7
Hearts11
Clubs2
Hearts5

Five random cards:
Hearts13
Spades8
Diamonds8
Hearts9
Clubs4
1
One Pair

Five random cards:
Diamonds10
Hearts2
Spades4
Hearts9
Hearts9
1
One Pair

Five random cards:
Hearts1
Spades3
Clubs2
Clubs13
Clubs8

Five random cards:
Clubs2
Clubs12
Diamonds7
Hearts13
Diamonds10

Five random cards:
Clubs3
Hearts11
Clubs1
Hearts7
Clubs1
1
One Pair

Five random cards:
Hearts1
Clubs1
Spades4
Diamonds12
Clubs8
1
One Pair

Five random cards:
Clubs6
Clubs5
Hearts13
Diamonds13
Hearts11
1
One Pair

Five random cards:
Clubs1
Hearts8
Clubs1
Spades2
Hearts7
1
One Pair

Five random cards:
Spades12
Hearts8
Spades7
Hearts8
Hearts6
1
One Pair

Five random cards:
Diamonds5
Spades5
Diamonds7
Diamonds7
Clubs12
1
2
Two Pair

Five random cards:
Hearts11
Hearts11
Clubs13
Hearts8
Diamonds8
1
2
Two Pair

Five random cards:
Clubs13
Clubs2
Clubs6
Clubs11
Hearts12

Five random cards:
Diamonds3
Hearts10
Clubs5
Hearts4
Diamonds10
1
One Pair

Five random cards:
Spades5
Clubs7
Spades5
Spades7
Hearts7
1
2
3
4
Full House

Five random cards:
Hearts3
Diamonds12
Clubs7
Diamonds4
Spades11

Five random cards:
Clubs10
Spades13
Clubs5
Clubs12
Spades11

Five random cards:
Clubs2
Spades11
Spades11
Diamonds12
Diamonds11
1
2
3
Three of a kind

Five random cards:
Diamonds12
Diamonds3
Hearts11
Hearts12
Diamonds12
1
2
3
Three of a kind

Five random cards:
Clubs6
Spades10
Clubs11
Clubs13
Spades1

Five random cards:
Clubs13
Diamonds7
Clubs1
Clubs13
Spades11
1
One Pair

Five random cards:
Clubs13
Spades13
Diamonds7
Diamonds5
Diamonds7
1
2
Two Pair

Five random cards:
Clubs9
Diamonds4
Clubs9
Diamonds4
Spades11
1
2
Two Pair

Five random cards:
Hearts10
Diamonds4
Diamonds13
Diamonds13
Clubs4
1
2
Two Pair

Five random cards:
Clubs11
Spades3
Diamonds5
Clubs6
Clubs5
1
One Pair

Five random cards:
Diamonds1
Hearts6
Spades6
Spades6
Diamonds1
1
2
3
4
Full House

Five random cards:
Diamonds8
Clubs9
Clubs6
Hearts1
Hearts10

Five random cards:
Clubs1
Hearts9
Diamonds7
Clubs11
Spades6

Five random cards:
Clubs9
Clubs13
Diamonds8
Diamonds7
Spades1

Five random cards:
Hearts8
Hearts2
Hearts2
Clubs7
Diamonds12
1
One Pair

Five random cards:
Hearts11
Spades13
Diamonds13
Diamonds5
Spades6
1
One Pair

Five random cards:
Spades5
Diamonds7
Diamonds1
Spades5
Diamonds10
1
One Pair

Five random cards:
Diamonds10
Diamonds4
Hearts5
Diamonds1
Clubs12

Five random cards:
Spades12
Hearts1
Spades5
Hearts3
Spades9

Five random cards:
Hearts1
Hearts8
Diamonds8
Diamonds6
Hearts6
1
2
Two Pair

Five random cards:
Spades7
Clubs9
Clubs4
Spades8
Spades4
1
One Pair

Five random cards:
Hearts10
Hearts10
Hearts10
Hearts8
Hearts7
1
2
3
Three of a kind

 It is a Flush

Five random cards:
Spades2
Diamonds13
Diamonds7
Hearts12
Hearts1

Five random cards:
Spades5
Spades12
Hearts4
Diamonds9
Spades13

Five random cards:
Clubs13
Diamonds4
Diamonds4
Spades8
Diamonds3
1
One Pair

Five random cards:
Clubs7
Clubs13
Clubs6
Clubs9
Diamonds10

Five random cards:
Hearts6
Clubs3
Clubs3
Spades11
Hearts5
1
One Pair

Five random cards:
Clubs7
Spades1
Clubs1
Spades3
Spades6
1
One Pair

Five random cards:
Diamonds9
Clubs1
Spades4
Spades2
Hearts11

Five random cards:
Hearts2
Hearts2
Hearts10
Clubs8
Clubs6
1
One Pair

Five random cards:
Clubs5
Hearts8
Hearts3
Spades6
Diamonds3
1
One Pair

Five random cards:
Clubs12
Hearts11
Diamonds8
Hearts11
Spades13
1
One Pair

Five random cards:
Clubs13
Spades7
Clubs13
Diamonds12
Clubs4
1
One Pair

Five random cards:
Spades6
Hearts1
Diamonds7
Hearts6
Diamonds7
1
2
Two Pair

Five random cards:
Hearts3
Hearts10
Clubs7
Diamonds11
Spades2

Five random cards:
Clubs6
Clubs9
Spades9
Clubs9
Hearts12
1
2
3
Three of a kind

Five random cards:
Diamonds4
Diamonds10
Hearts6
Clubs2
Hearts11

Five random cards:
Clubs1
Diamonds11
Spades9
Clubs11
Hearts5
1
One Pair

Five random cards:
Clubs10
Hearts8
Hearts8
Hearts8
Hearts5
1
2
3
Three of a kind

Five random cards:
Diamonds7
Hearts8
Diamonds4
Diamonds12
Spades9

Five random cards:
Diamonds9
Spades1
Diamonds5
Clubs12
Spades12
1
One Pair

Five random cards:
Clubs4
Diamonds2
Hearts9
Spades5
Diamonds13

Five random cards:
Spades1
Spades1
Hearts11
Clubs1
Diamonds8
1
2
3
Three of a kind

Five random cards:
Clubs12
Hearts2
Diamonds10
Clubs4
Clubs12
1
One Pair

Five random cards:
Diamonds4
Clubs2
Clubs4
Clubs5
Diamonds4
1
2
3
Three of a kind

Five random cards:
Diamonds6
Hearts8
Diamonds6
Diamonds3
Diamonds9
1
One Pair

Five random cards:
Clubs1
Hearts10
Hearts3
Clubs12
Diamonds10
1
One Pair

Five random cards:
Spades7
Diamonds5
Diamonds11
Hearts3
Hearts6

Five random cards:
Clubs1
Clubs4
Diamonds13
Hearts3
Diamonds4
1
One Pair

Five random cards:
Hearts7
Diamonds3
Diamonds13
Hearts5
Clubs12

Five random cards:
Diamonds12
Spades9
Spades9
Diamonds13
Spades13
1
2
Two Pair

Five random cards:
Clubs11
Spades12
Clubs10
Hearts3
Clubs2

Five random cards:
Hearts4
Hearts12
Hearts2
Diamonds13
Spades3

Five random cards:
Clubs9
Hearts1
Spades5
Clubs10
Spades13

Five random cards:
Clubs9
Hearts2
Clubs2
Clubs6
Clubs6
1
2
Two Pair

Five random cards:
Hearts7
Hearts2
Clubs6
Clubs5
Hearts6
1
One Pair

Five random cards:
Spades1
Spades4
Clubs1
Diamonds7
Hearts2
1
One Pair

Five random cards:
Spades2
Diamonds8
Clubs8
Clubs5
Diamonds5
1
2
Two Pair

Five random cards:
Diamonds2
Clubs2
Clubs12
Hearts3
Hearts4
1
One Pair

Five random cards:
Hearts8
Diamonds3
Clubs13
Clubs9
Spades8
1
One Pair

Five random cards:
Spades5
Diamonds7
Clubs4
Clubs12
Clubs1

Five random cards:
Clubs4
Clubs3
Diamonds11
Clubs8
Clubs11
1
One Pair

Five random cards:
Clubs13
Clubs6
Hearts11
Clubs11
Clubs1
1
One Pair

Five random cards:
Spades4
Diamonds9
Hearts1
Clubs13
Spades3

Five random cards:
Clubs11
Clubs6
Hearts8
Clubs3
Hearts5

Five random cards:
Spades13
Diamonds4
Diamonds2
Spades3
Spades7

Five random cards:
Diamonds10
Hearts13
Clubs5
Diamonds6
Spades7

Five random cards:
Diamonds8
Spades5
Diamonds9
Spades5
Hearts4
1
One Pair

Five random cards:
Diamonds1
Clubs4
Hearts8
Spades5
Spades8
1
One Pair

Five random cards:
Clubs6
Hearts8
Diamonds8
Diamonds10
Diamonds4
1
One Pair

Five random cards:
Clubs7
Diamonds9
Clubs12
Clubs12
Spades3
1
One Pair

Five random cards:
Spades13
Spades4
Clubs7
Diamonds2
Diamonds13
1
One Pair

Five random cards:
Diamonds5
Clubs3
Hearts12
Hearts11
Hearts11
1
One Pair

Five random cards:
Spades9
Clubs12
Diamonds4
Spades1
Diamonds7

Five random cards:
Clubs5
Spades3
Clubs5
Spades5
Clubs4
1
2
3
Three of a kind

Five random cards:
Diamonds4
Diamonds4
Clubs10
Clubs1
Diamonds11
1
One Pair

Five random cards:
Diamonds13
Hearts8
Clubs10
Spades9
Diamonds13
1
One Pair

Five random cards:
Diamonds8
Hearts11
Spades11
Hearts1
Spades1
1
2
Two Pair

Five random cards:
Clubs2
Hearts9
Spades12
Clubs2
Diamonds6
1
One Pair

Five random cards:
Diamonds2
Clubs9
Diamonds9
Spades9
Spades9
1
2
3
4
5
6
Four of a kind

Five random cards:
Hearts12
Spades6
Hearts9
Clubs5
Hearts6
1
One Pair

Five random cards:
Hearts6
Diamonds5
Hearts11
Spades7
Spades7
1
One Pair

Five random cards:
Spades2
Spades2
Spades7
Hearts7
Spades2
1
2
3
4
Full House

Five random cards:
Clubs12
Spades3
Diamonds5
Clubs9
Diamonds8

Five random cards:
Spades7
Clubs5
Diamonds13
Hearts1
Spades7
1
One Pair

Five random cards:
Clubs2
Clubs5
Clubs4
Spades11
Hearts13

Five random cards:
Clubs12
Clubs7
Diamonds1
Spades5
Spades12
1
One Pair

Five random cards:
Diamonds7
Clubs3
Spades5
Clubs3
Spades5
1
2
Two Pair

Five random cards:
Clubs13
Clubs4
Spades6
Spades3
Spades10

Five random cards:
Hearts7
Clubs2
Hearts6
Clubs2
Clubs13
1
One Pair

Five random cards:
Hearts3
Clubs10
Clubs5
Spades6
Diamonds9

Five random cards:
Spades3
Hearts3
Spades13
Diamonds9
Spades3
1
2
3
Three of a kind

Five random cards:
Spades7
Hearts12
Diamonds5
Clubs2
Spades11

Five random cards:
Spades5
Diamonds1
Clubs13
Diamonds1
Diamonds3
1
One Pair

Five random cards:
Hearts3
Hearts5
Hearts5
Spades9
Hearts4
1
One Pair

Five random cards:
Diamonds9
Spades9
Spades10
Hearts6
Clubs10
1
2
Two Pair

Five random cards:
Clubs11
Diamonds6
Hearts12
Hearts7
Diamonds3

Five random cards:
Hearts5
Spades10
Diamonds3
Spades3
Hearts5
1
2
Two Pair

Five random cards:
Clubs10
Diamonds4
Clubs1
Hearts8
Diamonds5

Five random cards:
Hearts13
Hearts11
Hearts10
Hearts11
Spades13
1
2
Two Pair

Five random cards:
Diamonds2
Diamonds2
Clubs8
Spades10
Spades12
1
One Pair

Five random cards:
Diamonds7
Clubs11
Spades10
Spades4
Clubs12

Five random cards:
Clubs7
Hearts3
Clubs7
Diamonds5
Clubs2
1
One Pair

Five random cards:
Spades7
Clubs5
Hearts4
Hearts4
Clubs4
1
2
3
Three of a kind

Five random cards:
Spades4
Spades4
Diamonds12
Spades3
Clubs5
1
One Pair

Five random cards:
Hearts10
Spades1
Clubs11
Diamonds4
Clubs13

Five random cards:
Diamonds2
Hearts13
Spades9
Spades6
Hearts6
1
One Pair

Five random cards:
Diamonds10
Hearts13
Spades10
Spades11
Clubs3
1
One Pair

Five random cards:
Diamonds7
Spades8
Spades5
Spades8
Spades13
1
One Pair

Five random cards:
Clubs8
Diamonds13
Spades13
Clubs12
Diamonds7
1
One Pair

Five random cards:
Spades7
Diamonds5
Hearts8
Spades4
Clubs8
1
One Pair

Five random cards:
Clubs4
Diamonds7
Hearts11
Hearts9
Spades6

Five random cards:
Hearts10
Hearts8
Clubs13
Diamonds13
Spades1
1
One Pair

Five random cards:
Hearts6
Hearts12
Clubs12
Clubs7
Clubs7
1
2
Two Pair

Five random cards:
Spades9
Diamonds12
Spades9
Diamonds12
Clubs2
1
2
Two Pair

Five random cards:
Spades12
Clubs7
Hearts9
Spades7
Spades6
1
One Pair

Five random cards:
Hearts11
Hearts8
Hearts2
Diamonds8
Diamonds6
1
One Pair

Five random cards:
Hearts1
Clubs9
Clubs1
Clubs8
Diamonds7
1
One Pair

Five random cards:
Hearts4
Diamonds12
Spades1
Diamonds11
Clubs3

Five random cards:
Diamonds9
Hearts10
Clubs3
Clubs3
Clubs2
1
One Pair

Five random cards:
Hearts6
Diamonds13
Spades10
Diamonds7
Hearts6
1
One Pair

Five random cards:
Clubs10
Clubs8
Diamonds11
Spades5
Hearts6

Five random cards:
Diamonds9
Hearts6
Spades3
Diamonds5
Hearts7

Five random cards:
Diamonds3
Hearts12
Clubs2
Clubs11
Diamonds12
1
One Pair

Five random cards:
Clubs13
Diamonds6
Hearts1
Spades2
Hearts8

Five random cards:
Hearts4
Clubs10
Hearts4
Clubs9
Clubs6
1
One Pair

Five random cards:
Clubs8
Hearts9
Clubs13
Spades1
Hearts7

Five random cards:
Diamonds8
Hearts12
Spades12
Diamonds13
Clubs6
1
One Pair

Five random cards:
Clubs8
Diamonds6
Diamonds2
Spades13
Clubs11

Five random cards:
Diamonds6
Diamonds7
Spades4
Hearts12
Clubs4
1
One Pair

Five random cards:
Spades4
Spades4
Clubs3
Spades11
Spades4
1
2
3
Three of a kind

Five random cards:
Hearts5
Spades7
Diamonds11
Diamonds6
Clubs5
1
One Pair

Five random cards:
Diamonds11
Clubs10
Diamonds11
Diamonds8
Diamonds9
1
One Pair

Five random cards:
Hearts13
Hearts7
Clubs1
Spades10
Spades5

Five random cards:
Diamonds9
Diamonds12
Diamonds8
Diamonds1
Hearts7

Five random cards:
Clubs4
Hearts1
Clubs3
Clubs6
Spades6
1
One Pair

Five random cards:
Hearts2
Clubs7
Hearts3
Diamonds7
Hearts3
1
2
Two Pair

Five random cards:
Clubs12
Diamonds5
Spades7
Hearts10
Diamonds13

Five random cards:
Hearts7
Clubs10
Diamonds2
Hearts8
Clubs11

Five random cards:
Hearts11
Clubs8
Hearts3
Diamonds7
Hearts9

Five random cards:
Clubs7
Diamonds11
Hearts2
Diamonds2
Spades13
1
One Pair

Five random cards:
Hearts1
Diamonds1
Hearts1
Diamonds3
Hearts5
1
2
3
Three of a kind

Five random cards:
Clubs10
Hearts9
Spades2
Hearts10
Hearts2
1
2
Two Pair

Five random cards:
Diamonds6
Diamonds11
Spades1
Hearts4
Spades4
1
One Pair

Five random cards:
Spades12
Clubs1
Clubs13
Hearts9
Hearts10

Five random cards:
Hearts5
Clubs8
Hearts10
Hearts6
Clubs1

Five random cards:
Clubs4
Clubs12
Diamonds4
Clubs4
Clubs5
1
2
3
Three of a kind

Five random cards:
Hearts12
Diamonds7
Hearts11
Spades2
Clubs4

Five random cards:
Clubs6
Hearts11
Hearts13
Clubs1
Hearts10

Five random cards:
Hearts7
Spades12
Hearts11
Hearts11
Clubs11
1
2
3
Three of a kind

Five random cards:
Hearts1
Diamonds10
Spades4
Clubs13
Diamonds9

Five random cards:
Hearts11
Spades12
Hearts5
Spades5
Spades3
1
One Pair

Five random cards:
Spades11
Spades9
Clubs12
Spades1
Hearts8

Five random cards:
Diamonds13
Clubs2
Diamonds8
Clubs4
Diamonds13
1
One Pair

Five random cards:
Spades6
Clubs6
Diamonds5
Diamonds11
Diamonds11
1
2
Two Pair

Five random cards:
Clubs9
Hearts5
Hearts6
Diamonds2
Diamonds8

Five random cards:
Spades4
Hearts3
Hearts13
Hearts12
Hearts3
1
One Pair

Five random cards:
Diamonds9
Spades11
Clubs4
Hearts10
Clubs5

Five random cards:
Hearts8
Diamonds3
Spades8
Clubs4
Hearts8
1
2
3
Three of a kind

Five random cards:
Hearts10
Diamonds4
Diamonds11
Spades5
Diamonds4
1
One Pair

Five random cards:
Spades3
Spades10
Spades11
Hearts2
Spades10
1
One Pair

Five random cards:
Diamonds5
Hearts13
Diamonds12
Spades10
Spades10
1
One Pair

Five random cards:
Diamonds2
Clubs7
Clubs12
Diamonds2
Diamonds2
1
2
3
Three of a kind

Five random cards:
Hearts1
Hearts13
Clubs7
Clubs12
Spades5

Five random cards:
Diamonds7
Diamonds12
Diamonds1
Diamonds5
Clubs10

Five random cards:
Diamonds13
Diamonds6
Spades9
Clubs13
Spades2
1
One Pair

Five random cards:
Diamonds6
Spades6
Diamonds9
Clubs1
Hearts9
1
2
Two Pair

Five random cards:
Diamonds5
Clubs1
Clubs7
Diamonds1
Spades8
1
One Pair

Five random cards:
Spades5
Spades8
Clubs12
Spades7
Diamonds11

Five random cards:
Diamonds6
Clubs7
Diamonds12
Spades3
Hearts11

Five random cards:
Spades6
Spades11
Diamonds9
Diamonds7
Spades12

Five random cards:
Hearts4
Clubs3
Clubs8
Diamonds8
Clubs5
1
One Pair

Five random cards:
Spades7
Hearts13
Spades5
Diamonds5
Spades12
1
One Pair

Five random cards:
Diamonds13
Spades8
Diamonds5
Spades13
Clubs7
1
One Pair

Five random cards:
Diamonds2
Diamonds11
Diamonds10
Spades8
Diamonds11
1
One Pair

Five random cards:
Spades11
Spades1
Spades8
Hearts2
Diamonds11
1
One Pair

Five random cards:
Clubs2
Clubs3
Clubs12
Clubs5
Hearts1

Five random cards:
Spades1
Hearts10
Diamonds4
Diamonds13
Clubs6

Five random cards:
Diamonds7
Spades6
Spades11
Hearts11
Diamonds5
1
One Pair

Five random cards:
Clubs6
Diamonds3
Clubs10
Diamonds3
Spades12
1
One Pair

Five random cards:
Spades10
Hearts11
Hearts2
Clubs1
Clubs9

Five random cards:
Clubs11
Diamonds12
Hearts11
Hearts11
Hearts2
1
2
3
Three of a kind

Five random cards:
Hearts5
Spades10
Spades2
Hearts8
Spades5
1
One Pair

Five random cards:
Spades4
Diamonds10
Clubs1
Spades7
Diamonds7
1
One Pair

Five random cards:
Spades9
Diamonds11
Clubs6
Diamonds8
Hearts4

Five random cards:
Clubs6
Diamonds9
Diamonds12
Clubs3
Clubs10

Five random cards:
Spades3
Clubs6
Clubs10
Clubs10
Spades9
1
One Pair

Five random cards:
Diamonds13
Spades3
Clubs5
Hearts3
Hearts9
1
One Pair

Five random cards:
Spades2
Clubs2
Spades2
Spades7
Spades7
1
2
3
4
Full House

Five random cards:
Hearts4
Clubs10
Spades13
Clubs8
Hearts1

Five random cards:
Spades8
Spades2
Spades8
Diamonds11
Clubs6
1
One Pair

Five random cards:
Diamonds8
Spades12
Spades4
Spades7
Spades6

Five random cards:
Spades9
Spades6
Hearts13
Spades2
Diamonds13
1
One Pair

Five random cards:
Spades4
Spades4
Clubs6
Spades7
Spades4
1
2
3
Three of a kind

Five random cards:
Clubs4
Spades9
Diamonds5
Hearts1
Clubs13

Five random cards:
Diamonds3
Spades6
Spades10
Spades6
Clubs12
1
One Pair

Five random cards:
Hearts2
Clubs3
Clubs9
Diamonds11
Spades2
1
One Pair

Five random cards:
Hearts7
Hearts8
Hearts13
Clubs1
Spades13
1
One Pair

Five random cards:
Diamonds10
Diamonds8
Hearts9
Clubs12
Clubs1

Five random cards:
Diamonds1
Spades13
Diamonds3
Hearts12
Spades7

Five random cards:
Clubs13
Hearts8
Clubs13
Hearts6
Diamonds11
1
One Pair

Five random cards:
Clubs13
Diamonds2
Hearts8
Hearts10
Clubs6

Five random cards:
Spades6
Spades9
Clubs12
Clubs11
Diamonds6
1
One Pair

Five random cards:
Hearts6
Hearts1
Hearts4
Spades9
Clubs13

Five random cards:
Hearts7
Diamonds1
Diamonds4
Hearts12
Clubs9

Five random cards:
Spades13
Diamonds4
Clubs4
Diamonds1
Clubs4
1
2
3
Three of a kind

Five random cards:
Spades3
Clubs8
Clubs4
Hearts4
Clubs7
1
One Pair

Five random cards:
Diamonds13
Hearts11
Spades4
Clubs7
Diamonds5

Five random cards:
Hearts10
Spades7
Spades4
Hearts10
Hearts13
1
One Pair

Five random cards:
Spades3
Spades11
Spades4
Clubs6
Clubs10

Five random cards:
Diamonds11
Clubs10
Clubs10
Diamonds9
Diamonds10
1
2
3
Three of a kind

Five random cards:
Diamonds12
Diamonds5
Diamonds9
Diamonds7
Clubs4

Five random cards:
Clubs10
Spades2
Spades6
Spades4
Hearts2
1
One Pair

Five random cards:
Diamonds9
Hearts1
Diamonds9
Hearts6
Clubs12
1
One Pair

Five random cards:
Diamonds9
Clubs8
Hearts7
Clubs10
Diamonds11

Five random cards:
Clubs5
Hearts12
Clubs12
Clubs12
Hearts8
1
2
3
Three of a kind

Five random cards:
Diamonds8
Spades10
Diamonds11
Diamonds12
Hearts9

Five random cards:
Clubs6
Hearts8
Clubs13
Spades13
Diamonds2
1
One Pair

Five random cards:
Diamonds4
Clubs1
Diamonds12
Hearts12
Hearts12
1
2
3
Three of a kind

Five random cards:
Diamonds11
Clubs8
Hearts8
Spades5
Hearts3
1
One Pair

Five random cards:
Clubs6
Spades11
Clubs2
Diamonds12
Diamonds10

Five random cards:
Hearts9
Hearts10
Hearts13
Hearts10
Clubs4
1
One Pair

Five random cards:
Clubs9
Clubs2
Diamonds4
Spades1
Clubs13

Five random cards:
Hearts7
Diamonds9
Spades4
Diamonds4
Diamonds4
1
2
3
Three of a kind

Five random cards:
Clubs11
Clubs6
Spades3
Spades6
Diamonds11
1
2
Two Pair

Five random cards:
Diamonds10
Hearts7
Spades8
Spades1
Clubs13

Five random cards:
Spades3
Spades2
Spades12
Spades12
Diamonds2
1
2
Two Pair

Five random cards:
Diamonds6
Clubs11
Hearts12
Hearts1
Diamonds4

Five random cards:
Clubs7
Diamonds12
Clubs10
Hearts9
Hearts9
1
One Pair

Five random cards:
Spades1
Hearts12
Spades4
Clubs12
Diamonds7
1
One Pair

Five random cards:
Spades3
Spades8
Hearts12
Clubs2
Hearts8
1
One Pair

Five random cards:
Clubs8
Spades3
Hearts4
Spades12
Hearts13

Five random cards:
Clubs10
Diamonds12
Hearts3
Spades1
Diamonds9

Five random cards:
Spades9
Diamonds7
Diamonds10
Hearts9
Diamonds9
1
2
3
Three of a kind

Five random cards:
Clubs13
Clubs13
Hearts1
Diamonds12
Diamonds12
1
2
Two Pair

Five random cards:
Spades7
Diamonds8
Spades7
Hearts8
Clubs10
1
2
Two Pair

Five random cards:
Spades11
Diamonds3
Diamonds11
Clubs6
Spades1
1
One Pair

Five random cards:
Diamonds11
Clubs8
Diamonds12
Spades7
Diamonds2

Five random cards:
Diamonds2
Hearts4
Clubs3
Spades12
Hearts3
1
One Pair

Five random cards:
Diamonds5
Diamonds5
Spades1
Clubs3
Spades6
1
One Pair

Five random cards:
Diamonds11
Diamonds9
Hearts3
Clubs12
Clubs9
1
One Pair

Five random cards:
Hearts4
Spades9
Hearts8
Clubs3
Clubs5

Five random cards:
Clubs2
Hearts8
Diamonds5
Spades1
Spades12

Five random cards:
Hearts4
Hearts13
Spades5
Diamonds2
Spades4
1
One Pair

Five random cards:
Clubs9
Clubs8
Hearts10
Hearts7
Hearts13

Five random cards:
Clubs3
Clubs12
Hearts6
Spades12
Spades10
1
One Pair

Five random cards:
Diamonds11
Clubs6
Diamonds6
Clubs1
Diamonds4
1
One Pair

Five random cards:
Diamonds5
Clubs2
Diamonds4
Spades6
Hearts3

Five random cards:
Hearts11
Spades4
Clubs11
Hearts11
Hearts13
1
2
3
Three of a kind

Five random cards:
Spades4
Spades13
Hearts2
Hearts12
Clubs1

Five random cards:
Spades4
Hearts3
Diamonds12
Clubs12
Hearts7
1
One Pair

Five random cards:
Hearts12
Hearts6
Hearts12
Diamonds8
Spades8
1
2
Two Pair

Five random cards:
Spades13
Hearts3
Clubs8
Hearts8
Spades7
1
One Pair

Five random cards:
Hearts7
Clubs7
Hearts10
Clubs2
Clubs10
1
2
Two Pair

Five random cards:
Diamonds6
Clubs5
Diamonds12
Diamonds9
Diamonds12
1
One Pair

Five random cards:
Clubs5
Spades9
Spades10
Clubs12
Clubs12
1
One Pair

Five random cards:
Spades10
Spades13
Clubs2
Spades9
Clubs10
1
One Pair

Five random cards:
Spades2
Clubs8
Hearts7
Hearts5
Hearts9

Five random cards:
Spades4
Clubs8
Clubs7
Hearts3
Spades4
1
One Pair

Five random cards:
Clubs5
Spades8
Clubs5
Clubs5
Clubs3
1
2
3
Three of a kind

Five random cards:
Hearts12
Hearts4
Spades9
Clubs11
Clubs1

Five random cards:
Hearts8
Hearts10
Diamonds9
Diamonds8
Hearts9
1
2
Two Pair

Five random cards:
Hearts7
Clubs13
Hearts13
Diamonds4
Clubs8
1
One Pair

Five random cards:
Hearts11
Diamonds3
Diamonds3
Hearts11
Spades7
1
2
Two Pair

Five random cards:
Spades11
Spades5
Spades3
Hearts7
Diamonds7
1
One Pair

Five random cards:
Diamonds9
Diamonds10
Clubs5
Diamonds9
Hearts12
1
One Pair

Five random cards:
Hearts9
Hearts9
Hearts9
Spades8
Spades9
1
2
3
4
5
6
Four of a kind

Five random cards:
Spades6
Clubs9
Spades6
Spades4
Spades6
1
2
3
Three of a kind

Five random cards:
Spades7
Spades4
Spades11
Spades10
Hearts4
1
One Pair

Five random cards:
Clubs12
Hearts10
Clubs1
Diamonds2
Spades10
1
One Pair

Five random cards:
Diamonds7
Diamonds6
Hearts8
Spades10
Spades2

Five random cards:
Hearts11
Diamonds10
Diamonds7
Hearts4
Diamonds9

Five random cards:
Diamonds11
Hearts5
Hearts10
Hearts6
Diamonds1

Five random cards:
Clubs6
Hearts12
Spades2
Spades3
Hearts5

Five random cards:
Clubs8
Hearts5
Hearts5
Diamonds2
Clubs8
1
2
Two Pair

Five random cards:
Hearts2
Hearts12
Diamonds3
Diamonds4
Hearts1

Five random cards:
Diamonds10
Hearts6
Hearts11
Clubs9
Spades12

Five random cards:
Hearts1
Hearts1
Clubs1
Hearts12
Spades6
1
2
3
Three of a kind

Five random cards:
Clubs12
Hearts5
Diamonds1
Spades12
Diamonds12
1
2
3
Three of a kind

Five random cards:
Diamonds6
Hearts4
Clubs4
Diamonds2
Hearts1
1
One Pair

Five random cards:
Spades12
Spades8
Hearts1
Diamonds13
Hearts9

Five random cards:
Spades13
Spades10
Clubs12
Hearts10
Hearts10
1
2
3
Three of a kind

Five random cards:
Clubs6
Spades8
Diamonds7
Diamonds8
Clubs9
1
One Pair

Five random cards:
Clubs3
Diamonds10
Diamonds6
Hearts3
Hearts11
1
One Pair

Five random cards:
Clubs7
Hearts2
Spades5
Hearts2
Clubs9
1
One Pair

Five random cards:
Diamonds8
Spades10
Clubs7
Spades13
Spades4

Five random cards:
Diamonds13
Hearts1
Clubs1
Hearts6
Diamonds4
1
One Pair

Five random cards:
Clubs2
Clubs2
Clubs7
Clubs7
Spades9
1
2
Two Pair

Five random cards:
Diamonds1
Spades13
Diamonds7
Hearts8
Hearts6

Five random cards:
Hearts9
Spades3
Diamonds6
Clubs7
Hearts4

Five random cards:
Diamonds8
Spades11
Hearts5
Spades6
Spades6
1
One Pair

Five random cards:
Spades2
Clubs3
Diamonds6
Clubs5
Hearts8

Five random cards:
Diamonds7
Diamonds7
Spades6
Spades1
Hearts1
1
2
Two Pair

Five random cards:
Hearts10
Diamonds4
Spades8
Spades8
Hearts4
1
2
Two Pair

Five random cards:
Clubs13
Spades8
Clubs4
Clubs2
Hearts3

Five random cards:
Clubs13
Spades12
Hearts13
Diamonds2
Hearts2
1
2
Two Pair

Five random cards:
Clubs3
Hearts11
Spades1
Spades4
Hearts2

Five random cards:
Diamonds4
Clubs3
Diamonds12
Spades5
Clubs13

Five random cards:
Diamonds7
Spades7
Hearts8
Hearts8
Hearts10
1
2
Two Pair

Five random cards:
Diamonds1
Hearts12
Clubs12
Hearts13
Spades8
1
One Pair

Five random cards:
Hearts3
Hearts6
Spades3
Spades11
Clubs12
1
One Pair

Five random cards:
Clubs6
Spades7
Spades8
Spades1
Spades12

Five random cards:
Clubs7
Clubs10
Diamonds5
Clubs2
Clubs6

Five random cards:
Diamonds7
Spades10
Diamonds11
Diamonds10
Clubs3
1
One Pair

Five random cards:
Hearts12
Spades11
Spades2
Diamonds12
Clubs4
1
One Pair

Five random cards:
Hearts11
Clubs9
Diamonds5
Diamonds4
Clubs2

 It is a Straight

Five random cards:
Hearts10
Clubs7
Diamonds7
Hearts10
Hearts7
1
2
3
4
Full House

Five random cards:
Spades1
Spades5
Spades11
Diamonds4
Spades11
1
One Pair

Five random cards:
Diamonds1
Hearts6
Hearts12
Diamonds10
Hearts9

Five random cards:
Clubs12
Clubs13
Hearts13
Hearts3
Clubs7
1
One Pair

Five random cards:
Hearts1
Diamonds1
Spades4
Clubs12
Diamonds4
1
2
Two Pair

Five random cards:
Diamonds5
Diamonds12
Hearts1
Hearts13
Hearts1
1
One Pair

Five random cards:
Hearts4
Spades12
Diamonds10
Spades2
Diamonds10
1
One Pair

Five random cards:
Diamonds11
Spades11
Clubs3
Hearts9
Clubs8
1
One Pair

Five random cards:
Diamonds2
Spades1
Spades5
Hearts4
Spades1
1
One Pair

Five random cards:
Spades8
Diamonds3
Spades8
Spades8
Diamonds1
1
2
3
Three of a kind

Five random cards:
Diamonds6
Clubs12
Clubs11
Clubs8
Diamonds6
1
One Pair

Five random cards:
Hearts3
Hearts8
Spades10
Diamonds9
Clubs7

Five random cards:
Diamonds3
Spades11
Spades11
Diamonds5
Spades11
1
2
3
Three of a kind

Five random cards:
Hearts1
Clubs9
Clubs2
Clubs7
Spades1
1
One Pair

Five random cards:
Diamonds4
Hearts12
Hearts11
Spades3
Spades3
1
One Pair

Five random cards:
Clubs12
Clubs2
Clubs8
Clubs12
Spades12
1
2
3
Three of a kind

Five random cards:
Diamonds7
Hearts12
Spades8
Spades12
Diamonds9
1
One Pair

Five random cards:
Clubs9
Spades2
Hearts3
Clubs11
Clubs13

Five random cards:
Hearts9
Diamonds11
Hearts9
Spades10
Diamonds13
1
One Pair

Five random cards:
Hearts6
Clubs4
Hearts10
Spades12
Clubs3

Five random cards:
Diamonds12
Diamonds1
Hearts4
Hearts1
Spades11
1
One Pair

Five random cards:
Hearts13
Hearts13
Clubs10
Spades12
Clubs9
1
One Pair

Five random cards:
Clubs9
Spades5
Diamonds9
Diamonds1
Diamonds1
1
2
Two Pair

Five random cards:
Clubs3
Hearts13
Hearts5
Clubs4
Hearts4
1
One Pair

Five random cards:
Spades9
Clubs7
Spades7
Spades7
Clubs9
1
2
3
4
Full House

Five random cards:
Hearts9
Hearts6
Hearts9
Spades9
Hearts5
1
2
3
Three of a kind

Five random cards:
Hearts7
Spades1
Hearts6
Clubs9
Clubs9
1
One Pair

Five random cards:
Clubs12
Spades4
Diamonds6
Clubs11
Diamonds6
1
One Pair

Five random cards:
Diamonds6
Clubs11
Spades11
Hearts1
Spades6
1
2
Two Pair

Five random cards:
Diamonds13
Spades10
Spades3
Clubs3
Spades11
1
One Pair

Five random cards:
Diamonds11
Diamonds6
Clubs10
Clubs9
Spades7

Five random cards:
Hearts4
Clubs5
Hearts1
Hearts13
Hearts13
1
One Pair

Five random cards:
Clubs7
Diamonds5
Clubs12
Diamonds8
Spades12
1
One Pair

Five random cards:
Spades3
Hearts10
Diamonds4
Clubs2
Clubs1

Five random cards:
Hearts6
Clubs9
Clubs3
Diamonds9
Diamonds10
1
One Pair

Five random cards:
Hearts2
Diamonds8
Spades4
Hearts1
Spades6

Five random cards:
Hearts5
Clubs1
Clubs9
Clubs2
Diamonds13

Five random cards:
Clubs8
Clubs6
Spades8
Clubs10
Hearts1
1
One Pair

Five random cards:
Diamonds2
Hearts9
Clubs5
Clubs2
Diamonds10
1
One Pair

Five random cards:
Spades11
Clubs7
Spades11
Hearts10
Clubs2
1
One Pair

Five random cards:
Diamonds7
Diamonds13
Hearts4
Diamonds6
Spades1

Five random cards:
Clubs5
Spades9
Clubs7
Spades10
Spades8

Five random cards:
Spades1
Spades10
Hearts8
Spades1
Diamonds6
1
One Pair

Five random cards:
Spades12
Clubs11
Diamonds1
Hearts10
Clubs12
1
One Pair

Five random cards:
Clubs8
Spades9
Clubs7
Clubs7
Clubs1
1
One Pair

Five random cards:
Spades2
Hearts5
Clubs8
Diamonds7
Spades2
1
One Pair

Five random cards:
Hearts11
Clubs13
Diamonds6
Hearts13
Hearts8
1
One Pair

Five random cards:
Hearts9
Diamonds12
Clubs8
Hearts11
Hearts6

Five random cards:
Hearts9
Hearts10
Diamonds12
Diamonds12
Clubs2
1
One Pair

Five random cards:
Clubs1
Hearts1
Clubs13
Hearts5
Spades7
1
One Pair

Five random cards:
Diamonds10
Spades5
Diamonds4
Spades10
Diamonds4
1
2
Two Pair

Five random cards:
Hearts3
Hearts2
Clubs5
Hearts9
Clubs9
1
One Pair

Five random cards:
Hearts9
Clubs5
Diamonds7
Diamonds12
Hearts4

Five random cards:
Hearts8
Diamonds12
Diamonds1
Hearts2
Spades1
1
One Pair

Five random cards:
Clubs10
Hearts7
Clubs8
Diamonds7
Hearts1
1
One Pair

Five random cards:
Clubs5
Diamonds3
Hearts5
Clubs5
Hearts4
1
2
3
Three of a kind

Five random cards:
Clubs11
Spades12
Hearts11
Diamonds11
Diamonds8
1
2
3
Three of a kind

Five random cards:
Clubs6
Diamonds11
Diamonds1
Spades3
Spades5

Five random cards:
Spades6
Hearts6
Diamonds11
Clubs11
Diamonds10
1
2
Two Pair

Five random cards:
Spades7
Clubs2
Hearts1
Clubs4
Hearts13

Five random cards:
Clubs12
Hearts5
Spades7
Diamonds3
Hearts3
1
One Pair

Five random cards:
Hearts10
Clubs10
Clubs1
Clubs1
Clubs6
1
2
Two Pair

Five random cards:
Diamonds10
Hearts2
Spades3
Hearts6
Hearts2
1
One Pair

Five random cards:
Clubs7
Diamonds2
Clubs4
Spades5
Spades1

Five random cards:
Spades1
Diamonds4
Diamonds10
Diamonds3
Hearts11

Five random cards:
Diamonds7
Diamonds11
Spades3
Hearts4
Hearts12

Five random cards:
Clubs1
Hearts3
Clubs8
Hearts4
Hearts4
1
One Pair

Five random cards:
Clubs10
Spades11
Hearts4
Hearts8
Spades3

Five random cards:
Diamonds2
Spades9
Hearts3
Spades6
Hearts1

Five random cards:
Hearts8
Hearts4
Diamonds11
Clubs1
Hearts5

Five random cards:
Hearts1
Hearts5
Spades2
Hearts5
Clubs6
1
One Pair

Five random cards:
Spades5
Hearts12
Clubs9
Clubs7
Clubs7
1
One Pair

Five random cards:
Diamonds5
Hearts13
Diamonds1
Clubs5
Hearts7
1
One Pair

Five random cards:
Clubs13
Hearts9
Spades11
Spades5
Spades8

Five random cards:
Spades7
Diamonds1
Clubs2
Diamonds1
Spades4
1
One Pair

Five random cards:
Clubs10
Clubs13
Clubs9
Spades7
Hearts3

Five random cards:
Spades7
Spades7
Hearts13
Spades7
Clubs9
1
2
3
Three of a kind

Five random cards:
Hearts5
Spades13
Clubs12
Spades11
Clubs6

Five random cards:
Spades12
Hearts2
Clubs6
Diamonds8
Clubs5

Five random cards:
Diamonds13
Diamonds10
Spades11
Spades3
Hearts12

Five random cards:
Clubs13
Clubs13
Hearts2
Hearts13
Clubs4
1
2
3
Three of a kind

Five random cards:
Hearts7
Hearts11
Diamonds8
Diamonds10
Diamonds4

Five random cards:
Clubs13
Clubs4
Diamonds13
Diamonds9
Diamonds9
1
2
Two Pair

Five random cards:
Spades9
Diamonds7
Clubs5
Spades12
Spades4

Five random cards:
Spades8
Diamonds9
Hearts8
Diamonds13
Spades7
1
One Pair

Five random cards:
Clubs3
Clubs2
Hearts2
Spades11
Hearts2
1
2
3
Three of a kind

Five random cards:
Diamonds12
Diamonds9
Clubs10
Diamonds3
Clubs5

Five random cards:
Clubs8
Clubs7
Diamonds9
Hearts10
Spades11

Five random cards:
Clubs9
Clubs5
Hearts3
Diamonds4
Hearts5
1
One Pair

Five random cards:
Hearts9
Spades2
Hearts9
Diamonds4
Clubs9
1
2
3
Three of a kind

Five random cards:
Spades5
Clubs10
Diamonds2
Diamonds5
Diamonds11
1
One Pair

Five random cards:
Spades7
Hearts5
Hearts5
Diamonds11
Hearts3
1
One Pair

Five random cards:
Diamonds13
Diamonds13
Spades8
Clubs7
Spades2
1
One Pair

Five random cards:
Clubs13
Diamonds6
Clubs9
Spades8
Diamonds4

Five random cards:
Hearts13
Diamonds12
Hearts5
Hearts5
Clubs8
1
One Pair

Five random cards:
Spades10
Hearts4
Spades8
Clubs3
Spades1

Five random cards:
Clubs5
Clubs7
Diamonds5
Diamonds5
Spades13
1
2
3
Three of a kind

Five random cards:
Clubs6
Spades7
Spades9
Spades10
Clubs1

Five random cards:
Spades9
Clubs6
Diamonds8
Hearts10
Diamonds8
1
One Pair

Five random cards:
Diamonds5
Clubs11
Diamonds5
Diamonds1
Diamonds10
1
One Pair

Five random cards:
Clubs3
Diamonds7
Clubs7
Clubs4
Spades2
1
One Pair

Five random cards:
Diamonds2
Clubs9
Diamonds2
Diamonds4
Clubs6
1
One Pair

Five random cards:
Spades10
Clubs10
Hearts8
Hearts11
Clubs10
1
2
3
Three of a kind

Five random cards:
Clubs13
Spades10
Diamonds9
Clubs1
Spades6

Five random cards:
Clubs4
Spades8
Diamonds5
Diamonds12
Diamonds2

Five random cards:
Hearts10
Hearts11
Spades1
Diamonds4
Diamonds1
1
One Pair

Five random cards:
Diamonds2
Hearts6
Hearts4
Spades5
Diamonds11

Five random cards:
Spades10
Diamonds2
Diamonds7
Diamonds2
Spades5
1
One Pair

Five random cards:
Diamonds11
Spades10
Hearts2
Clubs11
Clubs11
1
2
3
Three of a kind

Five random cards:
Diamonds12
Diamonds7
Diamonds5
Clubs11
Hearts9

Five random cards:
Hearts10
Hearts8
Clubs3
Spades4
Spades13

Five random cards:
Diamonds8
Clubs7
Spades7
Spades10
Hearts10
1
2
Two Pair

Five random cards:
Spades13
Spades9
Spades1
Clubs2
Spades13
1
One Pair

Five random cards:
Hearts3
Spades3
Diamonds6
Clubs6
Hearts9
1
2
Two Pair

Five random cards:
Clubs6
Diamonds10
Clubs9
Hearts4
Diamonds3

Five random cards:
Spades5
Diamonds2
Hearts5
Hearts3
Diamonds7
1
One Pair

Five random cards:
Clubs10
Hearts11
Diamonds10
Diamonds12
Diamonds6
1
One Pair

Five random cards:
Diamonds5
Hearts8
Clubs8
Spades10
Diamonds9
1
One Pair

Five random cards:
Hearts10
Hearts12
Spades11
Spades5
Spades11
1
One Pair

Five random cards:
Diamonds11
Spades10
Diamonds6
Diamonds11
Hearts5
1
One Pair

Five random cards:
Clubs12
Hearts7
Diamonds7
Spades1
Hearts11
1
One Pair

Five random cards:
Clubs4
Hearts12
Clubs3
Clubs7
Hearts5

Five random cards:
Spades11
Spades4
Diamonds10
Clubs8
Clubs8
1
One Pair

Five random cards:
Diamonds5
Diamonds4
Clubs4
Clubs11
Diamonds5
1
2
Two Pair

Five random cards:
Hearts12
Clubs4
Hearts3
Clubs13
Clubs9

Five random cards:
Spades11
Clubs11
Diamonds6
Hearts5
Spades1
1
One Pair

Five random cards:
Clubs6
Clubs2
Clubs2
Spades13
Hearts1
1
One Pair

Five random cards:
Spades4
Hearts7
Spades7
Diamonds6
Clubs10
1
One Pair

Five random cards:
Diamonds8
Hearts7
Spades3
Clubs3
Spades8
1
2
Two Pair

Five random cards:
Diamonds11
Diamonds4
Clubs10
Hearts1
Diamonds6

Five random cards:
Diamonds10
Clubs6
Diamonds3
Clubs7
Diamonds6
1
One Pair

Five random cards:
Diamonds4
Diamonds2
Clubs2
Hearts11
Spades13
1
One Pair

Five random cards:
Clubs5
Hearts6
Diamonds12
Clubs9
Diamonds6
1
One Pair

Five random cards:
Hearts8
Diamonds12
Spades10
Diamonds12
Clubs8
1
2
Two Pair

Five random cards:
Clubs3
Spades2
Diamonds7
Spades9
Spades13

Five random cards:
Diamonds4
Diamonds6
Diamonds5
Diamonds6
Diamonds7
1
One Pair

 It is a Flush

Five random cards:
Diamonds6
Spades13
Spades7
Clubs11
Spades7
1
One Pair

Five random cards:
Spades5
Spades10
Spades6
Diamonds6
Clubs11
1
One Pair

Five random cards:
Spades2
Spades10
Hearts11
Clubs5
Clubs7

Five random cards:
Diamonds4
Hearts12
Spades3
Clubs2
Diamonds5

Five random cards:
Spades5
Spades12
Diamonds6
Hearts5
Diamonds3
1
One Pair

Five random cards:
Clubs9
Diamonds8
Hearts4
Hearts11
Spades13

Five random cards:
Spades12
Spades9
Diamonds8
Diamonds5
Hearts12
1
One Pair

Five random cards:
Clubs10
Spades12
Diamonds13
Spades13
Spades12
1
2
Two Pair

Five random cards:
Hearts1
Hearts7
Diamonds11
Diamonds7
Clubs1
1
2
Two Pair

Five random cards:
Hearts4
Diamonds7
Hearts8
Diamonds2
Diamonds8
1
One Pair

Five random cards:
Diamonds10
Hearts3
Hearts4
Clubs8
Diamonds11

Five random cards:
Hearts4
Spades1
Clubs11
Hearts11
Diamonds11
1
2
3
Three of a kind

Five random cards:
Hearts3
Spades7
Spades5
Diamonds8
Spades1

Five random cards:
Clubs4
Diamonds8
Clubs2
Hearts5
Clubs4
1
One Pair

Five random cards:
Spades10
Spades3
Diamonds11
Clubs5
Spades1

Five random cards:
Clubs11
Hearts1
Spades4
Clubs8
Clubs10

Five random cards:
Hearts2
Hearts5
Spades13
Diamonds1
Hearts2
1
One Pair

Five random cards:
Diamonds1
Clubs7
Spades11
Diamonds9
Clubs7
1
One Pair

Five random cards:
Spades11
Spades9
Hearts10
Spades8
Hearts5

Five random cards:
Diamonds4
Diamonds7
Diamonds2
Clubs12
Spades2
1
One Pair

Five random cards:
Clubs9
Clubs6
Clubs6
Diamonds2
Diamonds13
1
One Pair

Five random cards:
Spades10
Diamonds11
Hearts9
Diamonds5
Spades1

Five random cards:
Spades8
Hearts5
Spades3
Spades5
Spades5
1
2
3
Three of a kind

Five random cards:
Hearts8
Hearts11
Diamonds4
Diamonds6
Clubs12

Five random cards:
Spades12
Spades9
Clubs6
Diamonds5
Hearts12
1
One Pair

Five random cards:
Clubs8
Spades9
Clubs8
Hearts6
Hearts11
1
One Pair

Five random cards:
Hearts13
Spades13
Diamonds7
Hearts7
Diamonds1
1
2
Two Pair

Five random cards:
Diamonds7
Spades3
Spades4
Hearts6
Clubs3
1
One Pair

Five random cards:
Spades10
Clubs5
Clubs4
Clubs4
Hearts12
1
One Pair

Five random cards:
Clubs7
Diamonds3
Diamonds6
Clubs7
Diamonds10
1
One Pair

Five random cards:
Diamonds4
Spades13
Clubs3
Clubs3
Diamonds5
1
One Pair

Five random cards:
Diamonds11
Spades8
Hearts13
Spades4
Spades8
1
One Pair

Five random cards:
Hearts10
Hearts3
Spades13
Diamonds8
Clubs6

Five random cards:
Clubs5
Hearts3
Clubs8
Spades2
Clubs5
1
One Pair

Five random cards:
Diamonds1
Hearts5
Clubs7
Spades10
Clubs3

Five random cards:
Diamonds4
Clubs7
Diamonds10
Hearts2
Spades11

Five random cards:
Spades2
Clubs4
Spades3
Hearts6
Hearts2
1
One Pair

Five random cards:
Diamonds10
Hearts2
Diamonds13
Spades10
Spades13
1
2
Two Pair

Five random cards:
Spades1
Hearts11
Hearts9
Spades9
Clubs6
1
One Pair

Five random cards:
Diamonds11
Hearts12
Hearts5
Hearts13
Spades4

Five random cards:
Hearts6
Clubs9
Clubs7
Diamonds12
Spades6
1
One Pair

Five random cards:
Spades8
Diamonds7
Clubs8
Spades10
Diamonds5
1
One Pair

Five random cards:
Hearts11
Clubs10
Clubs8
Spades4
Clubs2

 It is a Straight

Five random cards:
Diamonds4
Clubs10
Clubs9
Diamonds5
Spades7

Five random cards:
Spades13
Spades7
Diamonds8
Clubs7
Clubs8
1
2
Two Pair

Five random cards:
Diamonds6
Hearts11
Clubs2
Spades12
Hearts12
1
One Pair

Five random cards:
Diamonds12
Spades13
Hearts6
Clubs11
Spades11
1
One Pair

Five random cards:
Hearts11
Hearts7
Clubs5
Diamonds10
Spades7
1
One Pair

Five random cards:
Hearts10
Hearts3
Diamonds9
Hearts4
Spades8

Five random cards:
Clubs3
Hearts1
Clubs2
Diamonds3
Hearts9
1
One Pair

Five random cards:
Hearts5
Spades13
Clubs2
Diamonds6
Diamonds7

Five random cards:
Clubs3
Spades1
Clubs11
Diamonds12
Hearts10

Five random cards:
Hearts10
Hearts8
Clubs11
Diamonds8
Hearts2
1
One Pair

Five random cards:
Diamonds4
Diamonds1
Diamonds1
Hearts4
Clubs3
1
2
Two Pair

Five random cards:
Clubs6
Clubs11
Spades10
Clubs7
Hearts4

Five random cards:
Spades8
Clubs9
Diamonds5
Hearts10
Spades3

Five random cards:
Spades6
Clubs1
Spades9
Clubs4
Diamonds6
1
One Pair

Five random cards:
Hearts11
Clubs12
Clubs9
Spades1
Spades5

Five random cards:
Clubs7
Spades7
Hearts7
Spades10
Hearts9
1
2
3
Three of a kind

Five random cards:
Diamonds6
Hearts3
Spades7
Diamonds13
Clubs1

Five random cards:
Hearts2
Spades5
Diamonds6
Clubs5
Spades7
1
One Pair

Five random cards:
Diamonds10
Clubs10
Clubs3
Clubs10
Hearts4
1
2
3
Three of a kind

Five random cards:
Clubs9
Spades4
Clubs12
Hearts3
Clubs6

Five random cards:
Hearts2
Diamonds13
Spades3
Hearts2
Clubs8
1
One Pair

Five random cards:
Clubs7
Hearts10
Spades6
Diamonds1
Clubs11

Five random cards:
Hearts9
Spades4
Spades2
Clubs1
Hearts7

Five random cards:
Hearts7
Hearts8
Clubs9
Clubs6
Clubs10

Five random cards:
Clubs9
Spades2
Hearts4
Hearts4
Clubs1
1
One Pair

Five random cards:
Spades7
Clubs4
Diamonds5
Clubs4
Hearts12
1
One Pair

Five random cards:
Spades3
Clubs5
Clubs5
Hearts7
Diamonds1
1
One Pair

Five random cards:
Spades8
Diamonds13
Clubs10
Hearts8
Hearts4
1
One Pair

Five random cards:
Clubs12
Spades13
Clubs1
Clubs7
Diamonds1
1
One Pair

Five random cards:
Clubs2
Spades5
Clubs2
Spades9
Spades4
1
One Pair

Five random cards:
Diamonds6
Diamonds4
Diamonds11
Hearts4
Diamonds6
1
2
Two Pair

Five random cards:
Hearts6
Clubs2
Clubs2
Diamonds6
Diamonds5
1
2
Two Pair

Five random cards:
Spades3
Spades1
Spades9
Hearts6
Clubs12

Five random cards:
Hearts6
Diamonds12
Hearts12
Hearts1
Spades9
1
One Pair

Five random cards:
Diamonds2
Spades7
Spades7
Hearts3
Hearts3
1
2
Two Pair

Five random cards:
Clubs10
Diamonds5
Hearts13
Hearts5
Hearts1
1
One Pair

Five random cards:
Diamonds8
Spades10
Clubs8
Diamonds12
Hearts3
1
One Pair

Five random cards:
Hearts1
Hearts10
Spades13
Clubs4
Hearts4
1
One Pair

Five random cards:
Hearts10
Diamonds12
Diamonds12
Clubs11
Diamonds2
1
One Pair

Five random cards:
Spades13
Diamonds9
Spades8
Clubs2
Spades13
1
One Pair

Five random cards:
Spades3
Clubs2
Clubs11
Spades12
Hearts2
1
One Pair

Five random cards:
Hearts13
Hearts10
Clubs10
Hearts3
Diamonds8
1
One Pair

Five random cards:
Hearts12
Hearts1
Diamonds11
Spades1
Hearts6
1
One Pair

Five random cards:
Spades2
Diamonds11
Hearts8
Clubs10
Spades9

Five random cards:
Diamonds8
Hearts12
Hearts12
Spades1
Diamonds2
1
One Pair

Five random cards:
Clubs4
Clubs8
Spades3
Clubs12
Diamonds2

Five random cards:
Spades9
Diamonds2
Diamonds7
Spades13
Hearts12

Five random cards:
Spades7
Clubs6
Spades6
Clubs2
Clubs4
1
One Pair

Five random cards:
Diamonds9
Diamonds11
Hearts4
Clubs7
Diamonds11
1
One Pair

Five random cards:
Spades8
Diamonds8
Clubs7
Spades7
Hearts4
1
2
Two Pair

Five random cards:
Diamonds8
Spades5
Clubs12
Hearts3
Hearts5
1
One Pair

Five random cards:
Clubs2
Diamonds10
Spades12
Spades4
Spades9

Five random cards:
Diamonds2
Diamonds5
Diamonds4
Diamonds9
Spades13

Five random cards:
Spades10
Hearts6
Hearts10
Hearts1
Clubs13
1
One Pair

Five random cards:
Clubs13
Clubs6
Diamonds10
Diamonds6
Spades1
1
One Pair

Five random cards:
Diamonds10
Diamonds10
Clubs7
Spades1
Spades10
1
2
3
Three of a kind

Five random cards:
Clubs11
Clubs4
Spades5
Clubs7
Clubs7
1
One Pair

Five random cards:
Clubs6
Clubs2
Clubs2
Diamonds5
Clubs12
1
One Pair

Five random cards:
Hearts11
Spades9
Clubs6
Spades9
Clubs4
1
One Pair

Five random cards:
Diamonds6
Clubs8
Spades8
Hearts2
Diamonds8
1
2
3
Three of a kind

Five random cards:
Diamonds12
Hearts6
Diamonds1
Hearts4
Clubs7

Five random cards:
Hearts3
Spades5
Clubs8
Diamonds8
Hearts3
1
2
Two Pair

Five random cards:
Diamonds1
Diamonds10
Hearts8
Diamonds7
Spades12

Five random cards:
Spades3
Spades4
Diamonds11
Clubs13
Clubs1

Five random cards:
Spades5
Spades8
Hearts9
Spades10
Spades3

Five random cards:
Hearts4
Clubs1
Hearts9
Spades2
Spades1
1
One Pair

Five random cards:
Diamonds4
Diamonds6
Hearts3
Spades13
Clubs6
1
One Pair
Percentage of One Pairs47.5%
Percentage of two pairs10.1%
Percentage of three of a kind7.7%
Percentage of Full houses0.6
Percentage of four of a kind0.2
Percentage of straight0.3
Percentage of flush0.6
*/