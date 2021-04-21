package com.cocoall.forkedkawa.controller;

import antlr.StringUtils;
import com.cocoall.forkedkawa.dto.DeckDto;
import com.cocoall.forkedkawa.service.DeckService;
import com.cocoall.forkedkawa.util.ConstantesUtile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "WebService d'interactions avec les decks")
@RestController
@RequestMapping("/deck")
@Component
public class DeckController {

    private DeckService deckService;

    @Autowired
    public DeckController(DeckService deckService){
        this.deckService = deckService;
    }

    //CRUD Deck

    @ApiOperation(value = "Enregistrement d'un nouveau Deck")
    @PostMapping(value = "/save")
    ResponseEntity<DeckDto> saveDeck(@RequestBody DeckDto deckDto){
        try{
            DeckDto ret =  deckService.saveDeck(deckDto);
            return new ResponseEntity<>(ret, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Récupération d'un deck par son ID")
    @GetMapping(value = "/{id}")
    ResponseEntity<DeckDto> getDeckById(@PathVariable long id){
        DeckDto  deckDto = deckService.getDeckById(id);
        if(deckDto != null){
            return new ResponseEntity<>(deckDto, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ApiOperation(value = "Mise a jour d'un Deck")
    @PutMapping(value = "/update")
    ResponseEntity<DeckDto> updateDeck(@RequestBody DeckDto deckDto){
        try{
            DeckDto ret =  deckService.updateDeck(deckDto);
            return new ResponseEntity<>(ret, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "Suppression d'un deck par son ID")
    @DeleteMapping(value = "/delete/{id}")
    ResponseEntity<String> deleteDeckById(@PathVariable long id){
        try{
            deckService.deleteDeckById(id);
            return new ResponseEntity<>(ConstantesUtile.stringEmpty, HttpStatus.NO_CONTENT);
        }
        catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // =/= Fonctions de récupération de liste de Decks

    @ApiOperation(value = "Récupération des 10 derniers decks créer/modifié")
    @GetMapping(value = "/last10")
    ResponseEntity<List<DeckDto>> getLast10ModifiedDeck(){
        List<DeckDto>  ret = deckService.get10LastModifiedDeck();
        if(ret != null || ret.isEmpty()){
            return new ResponseEntity<>(ret, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
