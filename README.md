

# 09-Daten-aendern.pdf

# 5.1) 

CRUD steht für Create, Read, Update, Delete. Diese vier Aktionen beschreiben die grundlegenden Operationen in Datenbanken: 
- Create: Erstellen von Datensätzen.
- Read: Abrufen von Daten.
- Update: Ändern vorhandener Daten.
- Delete: Löschen von Daten. 

# 5.2)

```now()``` ist eine SQL-Funktion, die das aktuelle Datum und die aktuelle Uhrzeit des Servers zurückgibt. 
Wenn sie in einer INSERT-Anweisung verwendet wird, wie in diesem Fall bei den Feldern ```created_at``` und ```updated_at```, werden beide Spalten mit dem Zeitpunkt gefüllt, zu dem der Datensatz in die Datenbank eingefügt wurde.

# 5.3)

## Olaf Scholz

```bash
INSERT INTO users (
    username, email, password, name, bio, gender, birthday, city, country,
    centimeters, avatar, role, is_active, remember_token, created_at, updated_at
)
VALUES (
    'olafscholz', 'olaf.scholz@spd.de', 'ampel123!', 'Olaf Scholz',
    'Bundeskanzler von Deutschland', 'male', '1958-06-14 00:00:00', 'Berlin',
    'Deutschland', '170', 'avatar.png', 'user', '1', NULL, now(), now()
)
```

## Custom user

```bash
INSERT INTO users (
    username, email, password, name, bio, gender, birthday, city, country,
    centimeters, avatar, role, is_active, remember_token, created_at, updated_at
)
VALUES (
    'messi', 'messi@goat.de', 'betterthanRONALDO!69', 'Lionel Messi',
    'GOAT', 'male', '1987-06-24 00:00:00', 'Rosario',
    'Argentinien', '170', 'avatar.png', 'user', '1', NULL, now(), now()
)
```

# 5.4)

Das Feld ```id``` muss nicht explizit in der ```INSERT```-Anweisung angegeben werden, weil es als Primärschlüssel der Tabelle definiert ist und mit der Eigenschaft ```AUTO_INCREMENT``` oder einer ähnlichen Funktion im Datenbanksystem versehen ist.

# 5.5)

### 1. Alle weiblichen Nutzerinnen sollen 160 cm groß sein:
```bash
UPDATE users
SET centimeters = 160
WHERE gender = 'female';
```

### 2. Statt „Germany“ soll es im Feld ```country``` immer „Deutschland“ heißen:
```bash
UPDATE users
SET country = 'Deutschland'
WHERE country = 'Germany';
```

### 3. Ersetzen Sie die Körpergröße bei allen Dresdnern mit dem Wert FLOOR(RAND()*45)+150:
```bash
UPDATE users
SET centimeters = FLOOR(RAND() * 45) + 150
WHERE city = 'Dresden';
```
#### Erklärung:
```RAND():``` Generiert eine zufällige Gleitkommazahl zwischen 0 und 1.
```FLOOR():``` Rundet den Wert von ```RAND() * 45``` nach unten auf die nächste ganze Zahl.
Das Ergebnis ist ein zufälliger Wert zwischen 150 cm und 194 cm.

### 4. Aktivieren Sie den Account von Olaf Scholz:
```bash 
UPDATE users
SET is_active = 1
WHERE username = 'olafscholz';
```
#### Erklärung:
Vermutlich ist die Spalte ```is_active``` dafür zuständig, den Status eines Benutzerkontos zu speichern (```0``` = inaktiv, ```1``` = aktiv). Durch das Setzen auf ```1``` wird der Account von Olaf Scholz aktiviert

### 5. Ersetzen Sie die Körpergröße bei allen Münchnern mit einem zufälligen Wert zwischen 130 cm und 190 cm:
```
UPDATE users
SET centimeters = FLOOR(RAND() * 60) + 130
WHERE city = 'München';
```
#### Erklärung:
```RAND() * 60```: Liefert einen zufälligen Wert zwischen 0 und 60.
```FLOOR()```: Rundet diesen Wert auf die nächste ganze Zahl ab.
Das Ergebnis ist eine zufällige Größe zwischen 130 cm und 190 cm.

# 5.6)

### 1. Aktivieren Sie alle Accounts und legen Sie anschließend zwei user an, die nicht aktiviert werden:

```bash
UPDATE users
SET is_active = 1;

INSERT INTO users (
    username, email, password, name, bio, gender, birthday, city, country,
    centimeters, avatar, role, is_active, remember_token, created_at, updated_at
)
VALUES (
    'inactive_user1', 'inactive1@example.com', 'password123', 'Inactive User 1',
    'Test user 1', 'male', '1990-01-01 00:00:00', 'Hamburg', 'Deutschland', 
    '180', 'avatar1.png', 'user', '0', NULL, now(), now()
), (
    'inactive_user2', 'inactive2@example.com', 'password123', 'Inactive User 2',
    'Test user 2', 'female', '1995-01-01 00:00:00', 'Berlin', 'Deutschland', 
    '165', 'avatar2.png', 'user', '0', NULL, now(), now()
);
```

### 2. Löschen Sie alle nicht aktivierten Accounts:
```bash
DELETE FROM users
WHERE is_active = 0;
```

### 3. Löschen Sie Olaf Scholz:
```bash
DELETE FROM users
WHERE username = 'olafscholz';
```

# 5.7)

### 1. Warum ist CRUD in der Buchhaltung nicht erlaubt?

In der Buchhaltung dürfen Daten nicht einfach verändert oder gelöscht werden, um Manipulation zu verhindern. Gesetze schreiben vor, dass Buchhaltungsdaten korrekt und unverändert bleiben müssen. Das Löschen von Daten (```Delete```) ist nicht erlaubt, und Änderungen (```Update```) müssen immer nachvollziehbar sein. So bleiben alle Transaktionen transparent und überprüfbar.

### 2. Beispiele für Daten, die nicht ohne Weiteres verändert oder gelöscht werden dürfen:

- **Patientendaten**: Müssen dauerhaft aufbewahrt werden, um den Behandlungsverlauf zu dokumentieren.
- **Gerichtsurteile**: Dürfen nicht verändert werden, da sie offizielle Rechtsentscheidungen sind.
- **Verträge und Rechnungen**: Unterliegen gesetzlichen Aufbewahrungspflichten und müssen unverändert bleiben.
- **Wahlergebnisse**: Dürfen nicht verändert werden, um die Integrität der Wahlen zu sichern.
- **Steuerdaten**: Müssen archiviert werden und dürfen nicht gelöscht oder verändert werden.
