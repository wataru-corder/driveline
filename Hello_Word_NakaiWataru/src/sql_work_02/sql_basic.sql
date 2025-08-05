/*問1*/
SELECT uniform_num, name ,club
FROM players;
/*問2*/
SELECT * 
FROM countries
WHERE group_name = 'C';
/*問3*/
SELECT * 
FROM countries
WHERE NOT group_name = 'C';
/*問4*/
SELECT * 
FROM players
WHERE birth <= CURRENT_DATE - INTERVAL '40 years';
/*問5*/
SELECT * 
FROM players
WHERE height < '170';
/*問6*/
SELECT * 
FROM countries
WHERE ranking BETWEEN 36 AND 56;
/*問7*/
SELECT * 
FROM players
WHERE position IN('GK','DF','MF');
/*問8*/
SELECT * 
FROM goals
WHERE player_id IS NULL;
/*問9*/
SELECT * 
FROM goals
WHERE NOT player_id IS NULL;
/*問10*/
SELECT * 
FROM players
WHERE name LIKE '%ニョ';
/*問11*/
SELECT * 
FROM players
WHERE name LIKE '%ニョ%';
/*問12*/
SELECT * 
FROM players
WHERE (height < 165 OR weight < 60);
/*問13*/
SELECT * 
FROM players
WHERE position IN('FW','MF')AND 
height < 170;
/*問14*/
SELECT DISTINCT position
FROM players;
/*問15*/
SELECT
name,
club,
ROUND(weight / ((height / 100.0) * (height / 100.0)), 2) AS 体力指数
FROM players;
/*問16*/
SELECT *
FROM players
ORDER BY height DESC, weight DESC;
/*問17*/
SELECT 
  COALESCE(player_id, 9999) AS player_id,
  goal_time
FROM goals;
/*問18*/
SELECT ROUND(AVG(height),4) as 平均身長,
	   ROUND(AVG(weight),4) as 平均体重
FROM players;
/*問19*/
SELECT COUNT(*) AS 日本のゴール
FROM goals
WHERE player_id BETWEEN 714 AND 736;
/*問20*/
SELECT 
MAX(height) AS 最大身長,
MIN(weight) AS 最大体重
FROM players;
/*問21*/
SELECT 
  SUM(ranking) AS "CグループのFIFAランクの合計値"
FROM countries
WHERE group_name = 'C';
/*問22*/
SELECT countries.name, players.name, goal_time
FROM players
LEFT JOIN countries
ON  countries.id = players.country_id
LEFT JOIN goals
ON  goals.player_id = players.id
WHERE NOT goals.goal_time IS NULL;


/*問23*/
SELECT goals.goal_time, players.uniform_num, players.position, players.name
FROM goals
LEFT JOIN players
  ON players.id = goals.player_id;
/*問24*/
SELECT goals.goal_time, players.uniform_num, players.position, players.name
FROM players
RIGHT JOIN goals
  ON players.id = goals.player_id;
/*問25*/
SELECT  countries.name, goals.goal_time,players.position, players.name 
FROM players
LEFT JOIN goals
 ON players.id = goals.player_id
LEFT JOIN countries
 ON countries.id = players.country_id
WHERE NOT  goal_time IS NULL;
/*問26*/
SELECT name, (
  SELECT goal_time
  FROM goals
  WHERE goals.player_id = players.id
  LIMIT 1
) AS goal_time
FROM players
WHERE EXISTS (
  SELECT 1
  FROM goals
  WHERE goals.player_id = players.id
);
/*問27*/
SELECT 
    p.position,
    p.name,
    p.height,
    p.club
FROM players p
INNER JOIN (
    SELECT 
        position,
        MAX(height) AS max_height
    FROM players
    GROUP BY position
) max_pos ON p.position = max_pos.position 
          AND p.height = max_pos.max_height
ORDER BY p.position;
/*問28*/
SELECT group_name, 
MAX(ranking) AS "MAX(ranking)",
MIN(ranking) AS "MIN(ranking)"
FROM countries
WHERE group_name IN ('A', 'B')
GROUP BY group_name;
/*問29*/
SELECT 1980 AS 誕生年, COUNT(*) AS "COUNT(id)"
FROM players
WHERE birth BETWEEN '1980-01-01' AND '1980-12-31'

UNION

SELECT 1981 AS birth_year, COUNT(*) AS player_count
FROM players
WHERE birth BETWEEN '1981-01-01' AND '1981-12-31';
/*問30*/
SELECT 
    id,
    position,
    name,
    height,
    weight
FROM players
WHERE height > 195

UNION

SELECT 
    id,
    position,
    name,
    height,
    weight
FROM players
WHERE weight > 95

ORDER BY id;
/*問31*/
SELECT name, height, weight
FROM (
    SELECT
        *,
        ROW_NUMBER() OVER (ORDER BY height DESC, name ASC) AS ranking
    FROM players
) sub
WHERE ranking BETWEEN 6 AND 20
ORDER BY ranking;
/*問32*/

SELECT 
  pairings.kickoff,
  my_country.name AS my_country,
  enemy_country.name AS enemy_country,
  my_country.ranking AS my_ranking,
  enemy_country.ranking AS enemy_ranking,
  COUNT(goals.id) AS my_goals
FROM pairings 
INNER JOIN countries AS my_country
  ON pairings.my_country_id = my_country.id
INNER JOIN countries AS enemy_country
  ON pairings.enemy_country_id = enemy_country.id
LEFT JOIN goals
  ON goals.pairing_id = pairings.id
WHERE my_country.group_name = 'C'

GROUP BY 
  pairings.kickoff,
  my_country.name,
  enemy_country.name,
  my_country.ranking,
  enemy_country.ranking

ORDER BY 
  pairings.kickoff,
  my_country.ranking;

/*問33*/
SELECT 
  pairings.kickoff,
  my_country.name AS my_country,
  enemy_country.name AS enemy_country,
  my_country.ranking AS my_ranking,
  enemy_country.ranking AS enemy_ranking,
  (SELECT COUNT(goals.id) 
   FROM goals 
   WHERE goals.pairing_id = pairings.id) AS my_goals
FROM pairings 
INNER JOIN countries AS my_country
  ON pairings.my_country_id = my_country.id
INNER JOIN countries AS enemy_country
  ON pairings.enemy_country_id = enemy_country.id
WHERE my_country.group_name = 'C'
ORDER BY 
  pairings.kickoff,
  my_country.ranking;