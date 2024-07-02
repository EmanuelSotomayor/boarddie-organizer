package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.dto.BoardDTO;
import com.hex4w0rd.boarddie.dto.ColumnDTO;
import com.hex4w0rd.boarddie.repositories.BoardRepository;
import com.hex4w0rd.boarddie.request.BoardUpdateRequest;
import com.hex4w0rd.boarddie.services.IBoardService;
import com.hex4w0rd.boarddie.services.IMessageService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BoardServiceImpl implements IBoardService {

    private final BoardRepository boardRepository;
    private final ModelMapper modelMapper;
    private final IMessageService messageService;

    public BoardServiceImpl(BoardRepository boardRepository, ModelMapper modelMapper,
                            IMessageService messageService){
        this.boardRepository = boardRepository;
        this.modelMapper = modelMapper;
        this.messageService = messageService;
    }

    @Override
    public BoardDTO saveBoard(BoardDTO boardDTO) {
        return null;
    }

    @Override
    public BoardDTO updateBoardById(Long id, BoardUpdateRequest boardUpdateRequest) {
        return null;
    }

    @Override
    public Boolean deleteBoardById(Long id) {
        return null;
    }

    @Override
    public BoardDTO getBoardById(Long id) {
        return null;
    }

    @Override
    public Page<BoardDTO> getAllBoards() {
        return null;
    }

    @Override
    public Boolean updateBoardFavoriteStatus(Boolean check) {
        return null;
    }

    @Override
    public Boolean addColumnToBoard(Long boardId, ColumnDTO columnDTO) {
        return null;
    }

    @Override
    public Boolean deleteColumnOfBoard(Long boardId, Long columnId) {
        return null;
    }

    @Override
    public Boolean updateColumnOfBoard(Long boardId, Long columnId, ColumnDTO columnDTO) {
        return null;
    }

}