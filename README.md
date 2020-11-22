# PubCOI XML schemas

XML schemas for incoming / 2nd party PubCOI data; includes Maven config for building POJOs.

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

### Examples

COI declaration

```$xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<Declaration xmlns="http://pubcoi.org/ns/declaration-1.0-draft">
    <ID>8c273208-75d8-47a9-9601-616404f87e23</ID>
    <RecordCreatedDT>2020-11-21T00:00:00.000Z</RecordCreatedDT>
    <RecordVersion>1</RecordVersion>
    <AppliesFromDT>2010-01-01T00:00:00Z</AppliesFromDT>
    <AppliesUntilDT>2011-12-31T00:00:00Z</AppliesUntilDT>
    <Entity>
        <LegalName>Organisation Ltd</LegalName>
        <Relationship>shareholder</Relationship>
    </Entity>
</Declaration>
```