Berlin Clock Story

Narrative:
In order to explain the stake holders on how this Berlin Clock is working
As a developer
I Want to use this story to display its working behaviour

Scenario: Berlin clock OFF
Given the clock is turned OFF
When the time is '12:33:22'
Then the display lights will be of pattern 'O-OOOO-OOOO-OOOOOOOOOOO-OOOO'

Scenario: Berlin clock ON
Given the clock is turned ON
When the time is '12:24:33'
Then the display lights will be of pattern 'O-RROO-RROO-YYRYOOOOOOO-YYYY'


Scenario: Berlin clock ON
Given the clock is turned ON
When the time is '23:59:59'
Then the display lights will be of pattern 'O-RRRR-RRRO-YYRYYRYYRYY-YYYY'

Scenario: Berlin clock ON
Given the clock is turned ON
When the time is '00:00:00'
Then the display lights will be of pattern 'Y-RRRR-RRRR-OOOOOOOOOOO-OOOO'

Scenario: Berlin clock ON
Given the clock is turned ON
When the time is '00:08:14'
Then the display lights will be of pattern 'Y-OOOO-OOOO-YOOOOOOOOOO-YYYO'