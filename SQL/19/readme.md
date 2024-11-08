Die Aufgaben im Dokument behandeln SQL-Abfragen mit Fokus auf die Verbindung von Tabellen über JOIN-Befehle. Hier sind einige Details und Lösungen für die gestellten Aufgaben:

### Aufgabe 9.1: Aarons Fotos
1. **Primär- und Fremdschlüssel**:
   - Der **Primärschlüssel** (z. B. `id` in der Tabelle `users`) identifiziert jeden Datensatz in einer Tabelle eindeutig. Ein **Fremdschlüssel** (z. B. `user_id` in der Tabelle `photos`) verweist auf den Primärschlüssel einer anderen Tabelle und verbindet so die Datensätze miteinander.

2. **SELECT-Befehl, um die ID von `aaron183` zu finden**:
   ```sql
   SELECT id 
   FROM users 
   WHERE username = 'aaron183';
   ```

3. **SELECT-Befehl, um die Anzahl der Fotos von `aaron183` zu ermitteln**:
   ```sql
   SELECT COUNT(*) 
   FROM photos 
   WHERE user_id = (SELECT id FROM users WHERE username = 'aaron183');
   ```

### Aufgabe 9.2: Zwei Tabellen verbinden
Um zwei Tabellen ohne JOIN zu verbinden, wird der folgende Befehl verwendet:
```sql
SELECT COUNT(username) 
FROM users, photos 
WHERE username = 'aaron183';
```
Dieser Ansatz wird jedoch komplizierter und weniger übersichtlich, besonders bei mehreren Tabellen oder Bedingungen.

### Aufgabe 9.3: JOIN analysieren
Eine übersichtlichere Lösung nutzt den `JOIN`:
```sql
SELECT COUNT(users.id) 
FROM users 
JOIN photos ON users.id = photos.user_id 
WHERE username = 'aaron183';
```
Der Einsatz des `JOIN` ermöglicht eine klarere Struktur und macht den Code lesbarer, indem die Tabellen explizit über das `ON`-Statement verknüpft werden.

### Aufgabe 9.4: JOIN anwenden
Hier sind die Lösungen für die drei Teilfragen:
1. **Fotos der Mitglieder aus Hamburg**:
   ```sql
   SELECT photos.* 
   FROM users 
   JOIN photos ON users.id = photos.user_id 
   WHERE users.city = 'Hamburg';
   ```

2. **Top-10-Mitglieder nach Anzahl der Fotouploads**:
   ```sql
   SELECT users.username, COUNT(photos.id) AS upload_count 
   FROM users 
   JOIN photos ON users.id = photos.user_id 
   GROUP BY users.username 
   ORDER BY upload_count DESC 
   LIMIT 10;
   ```

3. **Anzahl der Fotos pro Mitglied**:
   ```sql
   SELECT users.username, COUNT(photos.id) AS upload_count 
   FROM users 
   LEFT JOIN photos ON users.id = photos.user_id 
   GROUP BY users.username;
   ```