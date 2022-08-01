# swapiClient
Client for the swapi.dev api written with Spring
Om gebruik te maken van deze client is Docker vereist en een client die werkt met PostgreSQL.

Voor je gebruik maakt van de client moet je eerst de docker-compose.yaml runnen die in de Docker map staat.
Daarna een SQL client die werkt met PostgreSQL downloaden en connectie maken met de docker container waarin de PostgreSQL server draait localhost:5432.
De database zelf moet postgres heten in lowercase. Dit staat hardcoded dus moet bij de aanmaak van de database ingevoerd worden.
Zodra je dat hebt gedaan kan je de code uit de SQL file create_analytics_db.sql in je PostgreSQL client invoeren om de gewenste table aan te maken.
Daarna zou je de applicatie moeten kunnen gebruiken.

Vriendelijke groet,

Florian.
