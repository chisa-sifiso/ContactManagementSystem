package tut.Contact.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tut.Contact.model.Contact;
import tut.Contact.service.ContactService;

import java.util.List;

public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping
    public ResponseEntity<Contact> addContact(@Valid @RequestBody Contact contact) {
        return ResponseEntity.ok(contactService.addContact(contact));
    }

    @GetMapping("/search/name/{name}")
    public List<Contact> searchByName(@PathVariable String name) {
        return contactService.searchByName(name);
    }

    @GetMapping("/search/phone/{phoneNumber}")
    public List<Contact> searchByPhoneNumber(@PathVariable String phoneNumber) {
        return contactService.searchByPhoneNumber(phoneNumber);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @Valid @RequestBody Contact contact) {
        try {
            return ResponseEntity.ok(contactService.updateContact(id, contact));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
        return ResponseEntity.noContent().build();
    }
}
