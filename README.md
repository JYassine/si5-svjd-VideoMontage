# SI5-VideoMontage-SVJD

Sous le dossier **external/scenario_python** se trouve les scénarios générés

Sous le dossier **external/scenario_xtext** se trouve un exemple de syntaxe pour tous les scénarios

## Pour lancer le projet sur un serveur web

**Important** : La version web ne permet pas de générer le code directement depuis l'éditeur, il faut passer par Eclipse... Mais il permettra d'avoir une timeline visuelle.

### Windows :

```console
$ git clone https://github.com/JYassine/si5-svjd-VideoMontage.git
$ cd external/org.xtext.svjd.VideoMontageSVJD.parent
$ gradlew.bat jettyRun
```

### Linux :

```console
$ git clone https://github.com/JYassine/si5-svjd-VideoMontage.git
$ cd external/org.xtext.svjd.VideoMontageSVJD.parent
$ sh gradlew jettyRun
```
