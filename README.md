# PubCOI core data model

XML schema for incoming / 2nd party PubCOI data; includes Maven config for building POJOs.

This model is used by third parties who wish to submit information to PubCOI: this includes 
journals, employers, or individuals. Internal data model will be defined and stored elsewhere.

Build requires Maven. To build:

```
mvn clean package
```

### Principles

1. All information is to be publicly disclosed, publicly accessible and publicly searchable.
1. An organisation may be a charity, political party, "think tank", trust or otherwise: not just a commercial entity.
1. Benefits include everything from a commission for undertaking a piece of research, right through to a cheap promotional pen gifted by an organisational representative.
1. An ‘interest’ includes equity, royalties, patents and otherwise.

